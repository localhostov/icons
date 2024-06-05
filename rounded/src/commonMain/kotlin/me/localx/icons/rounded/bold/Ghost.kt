package me.localx.icons.rounded.bold

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

public val Icons.Bold.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.763f, -0.573f, 1.425f, -1.331f, 1.511f)
                curveToRelative(-0.76f, 0.087f, -1.46f, -0.389f, -1.631f, -1.133f)
                curveToRelative(-0.098f, -0.425f, -0.612f, -0.877f, -1.372f, -0.877f)
                reflectiveCurveToRelative(-1.273f, 0.452f, -1.371f, 0.877f)
                curveToRelative(-0.157f, 0.681f, -0.763f, 1.164f, -1.462f, 1.164f)
                reflectiveCurveToRelative(-1.305f, -0.482f, -1.462f, -1.164f)
                curveToRelative(-0.098f, -0.425f, -0.612f, -0.877f, -1.372f, -0.877f)
                reflectiveCurveToRelative(-1.274f, 0.452f, -1.372f, 0.877f)
                curveToRelative(-0.157f, 0.681f, -0.763f, 1.164f, -1.462f, 1.164f)
                reflectiveCurveToRelative(-1.305f, -0.482f, -1.462f, -1.164f)
                curveToRelative(-0.098f, -0.425f, -0.612f, -0.877f, -1.371f, -0.877f)
                reflectiveCurveToRelative(-1.274f, 0.452f, -1.372f, 0.877f)
                curveToRelative(-0.158f, 0.688f, -0.77f, 1.164f, -1.46f, 1.164f)
                curveToRelative(-0.057f, 0.0f, -0.113f, -0.003f, -0.171f, -0.01f)
                curveToRelative(-0.758f, -0.086f, -1.331f, -0.728f, -1.331f, -1.49f)
                verticalLineToRelative(-12.541f)
                curveTo(2.0f, 4.486f, 6.486f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                close()
                moveTo(19.0f, 10.0f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.14f, -7.0f, 7.0f)
                verticalLineToRelative(9.193f)
                curveToRelative(0.423f, -0.126f, 0.872f, -0.193f, 1.333f, -0.193f)
                curveToRelative(1.064f, 0.0f, 2.06f, 0.359f, 2.833f, 0.961f)
                curveToRelative(0.773f, -0.603f, 1.77f, -0.961f, 2.833f, -0.961f)
                reflectiveCurveToRelative(2.06f, 0.359f, 2.833f, 0.961f)
                curveToRelative(1.109f, -0.863f, 2.766f, -1.184f, 4.167f, -0.768f)
                verticalLineToRelative(-9.193f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
