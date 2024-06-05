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

public val Icons.Bold.SkiLift: ImageVector
    get() {
        if (_skiLift != null) {
            return _skiLift!!
        }
        _skiLift = Builder(name = "SkiLift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.106f, 11.021f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 2.919f, 9.979f)
                lineTo(4.63f, 14.57f)
                arcToRelative(2.918f, 2.918f, 0.0f, false, false, 0.644f, 0.8f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.984f, 2.25f)
                arcToRelative(5.949f, 5.949f, 0.0f, false, true, -1.352f, -1.732f)
                close()
                moveTo(23.61f, 9.89f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.74f, 1.22f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, true, -0.73f, 1.967f)
                lineTo(17.0f, 14.389f)
                lineToRelative(-1.137f, -2.426f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.226f, -1.227f)
                lineToRelative(-0.79f, 0.315f)
                lineToRelative(-1.116f, -3.2f)
                arcToRelative(2.976f, 2.976f, 0.0f, false, false, -5.506f, -0.015f)
                arcToRelative(2.889f, 2.889f, 0.0f, false, false, -0.031f, 2.2f)
                reflectiveCurveToRelative(1.042f, 3.01f, 1.075f, 3.075f)
                arcToRelative(3.479f, 3.479f, 0.0f, false, false, 4.49f, 1.6f)
                lineToRelative(2.594f, -1.036f)
                lineToRelative(0.877f, 1.87f)
                lineTo(0.921f, 21.116f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.158f, 2.768f)
                lineToRelative(19.249f, -8.053f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 23.61f, 9.89f)
                close()
                moveTo(14.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 7.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 9.0f)
                close()
                moveTo(6.5f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 5.0f)
                close()
            }
        }
        .build()
        return _skiLift!!
    }

private var _skiLift: ImageVector? = null
