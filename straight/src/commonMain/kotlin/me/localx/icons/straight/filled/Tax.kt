package me.localx.icons.straight.filled

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

public val Icons.Filled.Tax: ImageVector
    get() {
        if (_tax != null) {
            return _tax!!
        }
        _tax = Builder(name = "Tax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(17.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(11.885f, 13.63f)
                curveToRelative(-0.046f, -0.02f, -0.087f, -0.03f, -0.127f, -0.03f)
                curveToRelative(-0.041f, 0.0f, -0.08f, 0.01f, -0.118f, 0.031f)
                curveToRelative(-0.098f, 0.053f, -0.174f, 0.162f, -0.201f, 0.29f)
                lineToRelative(-0.726f, 3.079f)
                horizontalLineToRelative(2.081f)
                lineToRelative(-0.701f, -3.019f)
                curveToRelative(-0.047f, -0.212f, -0.151f, -0.326f, -0.207f, -0.351f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(17.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(6.5f, 13.6f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.6f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-6.4f)
                close()
                moveTo(15.1f, 20.0f)
                lineToRelative(-1.447f, -6.373f)
                curveToRelative(-0.146f, -0.668f, -0.565f, -1.213f, -1.118f, -1.459f)
                curveToRelative(-0.251f, -0.112f, -0.514f, -0.168f, -0.776f, -0.168f)
                curveToRelative(-0.305f, 0.0f, -0.607f, 0.075f, -0.882f, 0.225f)
                curveToRelative(-0.509f, 0.277f, -0.875f, 0.776f, -1.001f, 1.356f)
                lineToRelative(-1.475f, 6.418f)
                horizontalLineToRelative(1.607f)
                lineToRelative(0.33f, -1.4f)
                horizontalLineToRelative(2.829f)
                lineToRelative(0.325f, 1.4f)
                horizontalLineToRelative(1.609f)
                close()
                moveTo(19.206f, 16.001f)
                lineToRelative(1.994f, -4.0f)
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
                close()
            }
        }
        .build()
        return _tax!!
    }

private var _tax: ImageVector? = null
