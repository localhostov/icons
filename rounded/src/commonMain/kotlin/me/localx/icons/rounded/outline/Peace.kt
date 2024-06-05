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

public val Icons.Outline.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 1.864f, -0.513f, 3.61f, -1.405f, 5.105f)
                lineToRelative(-7.595f, -7.595f)
                lineTo(13.0f, 2.05f)
                curveToRelative(5.046f, 0.503f, 9.0f, 4.773f, 9.0f, 9.95f)
                close()
                moveTo(11.0f, 2.05f)
                verticalLineToRelative(7.421f)
                lineToRelative(-7.61f, 7.61f)
                curveToRelative(-0.883f, -1.49f, -1.39f, -3.227f, -1.39f, -5.081f)
                curveTo(2.0f, 6.823f, 5.954f, 2.553f, 11.0f, 2.05f)
                close()
                moveTo(4.591f, 18.709f)
                lineToRelative(6.409f, -6.409f)
                verticalLineToRelative(9.651f)
                curveToRelative(-2.532f, -0.253f, -4.789f, -1.453f, -6.409f, -3.241f)
                close()
                moveTo(13.0f, 21.95f)
                verticalLineToRelative(-9.612f)
                lineToRelative(6.391f, 6.391f)
                curveToRelative(-1.619f, 1.777f, -3.868f, 2.969f, -6.391f, 3.221f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
