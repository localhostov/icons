package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.PlugCircleCheck: ImageVector
    get() {
        if (_plugCircleCheck != null) {
            return _plugCircleCheck!!
        }
        _plugCircleCheck = Builder(name = "PlugCircleCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.859f, -3.14f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(19.589f, 14.692f)
                lineToRelative(-3.229f, 3.175f)
                lineToRelative(-1.63f, -1.58f)
                lineToRelative(-1.393f, 1.436f)
                lineToRelative(1.846f, 1.789f)
                curveToRelative(0.315f, 0.315f, 0.733f, 0.488f, 1.179f, 0.488f)
                reflectiveCurveToRelative(0.864f, -0.174f, 1.172f, -0.482f)
                lineToRelative(3.457f, -3.399f)
                lineToRelative(-1.402f, -1.426f)
                close()
            }
        }
        .build()
        return _plugCircleCheck!!
    }

private var _plugCircleCheck: ImageVector? = null
