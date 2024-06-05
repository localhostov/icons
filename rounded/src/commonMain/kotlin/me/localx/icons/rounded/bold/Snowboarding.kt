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

public val Icons.Bold.Snowboarding: ImageVector
    get() {
        if (_snowboarding != null) {
            return _snowboarding!!
        }
        _snowboarding = Builder(name = "Snowboarding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.149f, 19.53f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.0f, 0.7f)
                arcToRelative(1.343f, 1.343f, 0.0f, false, true, -0.769f, 0.69f)
                arcToRelative(1.376f, 1.376f, 0.0f, false, true, -1.07f, -0.074f)
                lineTo(17.0f, 19.82f)
                verticalLineTo(15.863f)
                arcToRelative(3.513f, 3.513f, 0.0f, false, false, -1.1f, -2.547f)
                lineToRelative(-2.731f, -2.575f)
                lineToRelative(1.155f, -1.575f)
                lineToRelative(5.341f, 3.58f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.67f, -2.492f)
                lineTo(13.288f, 4.86f)
                arcTo(5.485f, 5.485f, 0.0f, false, false, 10.335f, 4.0f)
                horizontalLineTo(9.157f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, true, -1.768f, -0.732f)
                lineTo(5.561f, 1.439f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.439f, 3.561f)
                lineTo(5.268f, 5.389f)
                arcTo(5.462f, 5.462f, 0.0f, false, false, 9.157f, 7.0f)
                horizontalLineToRelative(0.757f)
                lineTo(8.725f, 8.547f)
                arcTo(3.515f, 3.515f, 0.0f, false, false, 8.0f, 10.68f)
                verticalLineToRelative(1.966f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.313f, 0.464f)
                lineTo(4.666f, 14.318f)
                lineToRelative(-0.882f, -0.393f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -0.658f, -1.794f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.4f, 10.869f)
                arcToRelative(4.354f, 4.354f, 0.0f, false, false, 2.139f, 5.787f)
                lineToRelative(15.507f, 6.916f)
                arcToRelative(4.351f, 4.351f, 0.0f, false, false, 5.805f, -2.041f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.149f, 19.53f)
                close()
                moveTo(8.8f, 15.9f)
                arcTo(3.483f, 3.483f, 0.0f, false, false, 11.0f, 12.815f)
                lineTo(13.843f, 15.5f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, true, 0.157f, 0.364f)
                verticalLineToRelative(2.619f)
                lineToRelative(-5.515f, -2.46f)
                close()
                moveTo(14.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 16.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 2.5f)
                close()
            }
        }
        .build()
        return _snowboarding!!
    }

private var _snowboarding: ImageVector? = null
