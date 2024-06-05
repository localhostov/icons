package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.ReservationTable: ImageVector
    get() {
        if (_reservationTable != null) {
            return _reservationTable!!
        }
        _reservationTable = Builder(name = "ReservationTable", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.938f, 17.305f)
                lineToRelative(-1.972f, -11.174f)
                curveToRelative(-0.422f, -2.394f, -2.493f, -4.131f, -4.924f, -4.131f)
                lineTo(6.958f, 2.0f)
                curveToRelative(-3.458f, 0.0f, -4.664f, 2.655f, -4.924f, 4.131f)
                lineTo(0.062f, 17.305f)
                curveToRelative(-0.206f, 1.167f, 0.113f, 2.357f, 0.875f, 3.267f)
                curveToRelative(0.762f, 0.908f, 1.879f, 1.429f, 3.064f, 1.429f)
                horizontalLineToRelative(0.999f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.999f)
                curveToRelative(-0.593f, 0.0f, -1.151f, -0.261f, -1.532f, -0.715f)
                curveToRelative(-0.381f, -0.454f, -0.541f, -1.049f, -0.438f, -1.633f)
                lineToRelative(1.972f, -11.174f)
                curveToRelative(0.062f, -0.354f, 0.185f, -0.684f, 0.355f, -0.979f)
                lineToRelative(2.339f, 12.426f)
                curveToRelative(0.445f, 2.361f, 2.511f, 4.075f, 4.914f, 4.075f)
                horizontalLineToRelative(8.387f)
                curveToRelative(1.186f, 0.0f, 2.303f, -0.521f, 3.064f, -1.429f)
                curveToRelative(0.762f, -0.909f, 1.081f, -2.1f, 0.875f, -3.267f)
                close()
                moveTo(21.531f, 19.285f)
                curveToRelative(-0.381f, 0.454f, -0.939f, 0.715f, -1.532f, 0.715f)
                horizontalLineToRelative(-8.387f)
                curveToRelative(-1.441f, 0.0f, -2.681f, -1.028f, -2.948f, -2.444f)
                lineToRelative(-2.531f, -13.441f)
                curveToRelative(0.263f, -0.075f, 0.54f, -0.114f, 0.824f, -0.114f)
                horizontalLineToRelative(10.085f)
                curveToRelative(1.458f, 0.0f, 2.701f, 1.042f, 2.954f, 2.479f)
                lineToRelative(1.972f, 11.174f)
                curveToRelative(0.103f, 0.584f, -0.056f, 1.179f, -0.438f, 1.633f)
                close()
                moveTo(10.0f, 9.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(10.731f, 13.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(19.5f, 16.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _reservationTable!!
    }

private var _reservationTable: ImageVector? = null
