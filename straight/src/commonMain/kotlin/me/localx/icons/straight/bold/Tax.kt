package me.localx.icons.straight.bold

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

public val Icons.Bold.Tax: ImageVector
    get() {
        if (_tax != null) {
            return _tax!!
        }
        _tax = Builder(name = "Tax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 21.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 2.993f)
                curveTo(0.0f, 1.339f, 1.346f, -0.007f, 3.0f, -0.007f)
                horizontalLineToRelative(11.382f)
                lineToRelative(5.618f, 5.665f)
                verticalLineToRelative(3.342f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.007f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 2.993f)
                lineTo(3.0f, 2.993f)
                verticalLineToRelative(18.007f)
                close()
                moveTo(8.3f, 19.0f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(2.001f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.899f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.6f)
                close()
                moveTo(11.807f, 19.0f)
                horizontalLineToRelative(-1.607f)
                lineToRelative(1.475f, -6.418f)
                curveToRelative(0.126f, -0.58f, 0.492f, -1.079f, 1.001f, -1.356f)
                curveToRelative(0.276f, -0.15f, 0.578f, -0.225f, 0.882f, -0.225f)
                curveToRelative(0.262f, 0.0f, 0.526f, 0.056f, 0.776f, 0.168f)
                curveToRelative(0.553f, 0.246f, 0.972f, 0.791f, 1.118f, 1.459f)
                lineToRelative(1.447f, 6.373f)
                horizontalLineToRelative(-1.609f)
                lineToRelative(-0.325f, -1.4f)
                horizontalLineToRelative(-2.829f)
                lineToRelative(-0.33f, 1.4f)
                close()
                moveTo(12.514f, 16.001f)
                horizontalLineToRelative(2.081f)
                lineToRelative(-0.701f, -3.019f)
                curveToRelative(-0.047f, -0.212f, -0.151f, -0.326f, -0.207f, -0.351f)
                curveToRelative(-0.046f, -0.02f, -0.087f, -0.03f, -0.127f, -0.03f)
                curveToRelative(-0.041f, 0.0f, -0.08f, 0.01f, -0.118f, 0.031f)
                curveToRelative(-0.098f, 0.053f, -0.174f, 0.162f, -0.201f, 0.29f)
                lineToRelative(-0.726f, 3.079f)
                close()
                moveTo(23.001f, 11.001f)
                horizontalLineToRelative(-1.812f)
                lineToRelative(-1.088f, 2.182f)
                lineToRelative(-1.088f, -2.182f)
                horizontalLineToRelative(-1.812f)
                lineToRelative(1.994f, 4.0f)
                lineToRelative(-1.994f, 4.0f)
                horizontalLineToRelative(1.812f)
                lineToRelative(1.088f, -2.182f)
                lineToRelative(1.088f, 2.182f)
                horizontalLineToRelative(1.812f)
                lineToRelative(-1.994f, -4.0f)
                lineToRelative(1.994f, -4.0f)
                close()
            }
        }
        .build()
        return _tax!!
    }

private var _tax: ImageVector? = null
