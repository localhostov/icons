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
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(20.222f, 15.788f)
                curveToRelative(0.382f, 0.398f, 0.369f, 1.031f, -0.029f, 1.414f)
                lineToRelative(-2.213f, 2.124f)
                curveToRelative(-0.452f, 0.446f, -1.051f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.204f, -0.224f, -1.664f, -0.674f)
                lineToRelative(-1.132f, -1.109f)
                curveToRelative(-0.395f, -0.386f, -0.401f, -1.02f, -0.015f, -1.414f)
                curveToRelative(0.387f, -0.394f, 1.02f, -0.401f, 1.414f, -0.014f)
                lineToRelative(1.131f, 1.108f)
                curveToRelative(0.145f, 0.142f, 0.378f, 0.139f, 0.522f, 0.0f)
                lineToRelative(2.223f, -2.135f)
                curveToRelative(0.398f, -0.382f, 1.03f, -0.371f, 1.414f, 0.029f)
                close()
                moveTo(9.0f, 18.922f)
                verticalLineToRelative(4.078f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.078f)
                curveToRelative(-3.417f, -0.479f, -6.0f, -3.458f, -6.0f, -6.922f)
                verticalLineToRelative(-4.0f)
                curveTo(0.448f, 8.0f, 0.0f, 7.553f, 0.0f, 7.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(4.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.475f, 1.844f, 4.603f, 4.289f, 4.95f)
                curveToRelative(0.975f, 0.139f, 1.711f, 0.986f, 1.711f, 1.972f)
                close()
            }
        }
        .build()
        return _plugCircleCheck!!
    }

private var _plugCircleCheck: ImageVector? = null
