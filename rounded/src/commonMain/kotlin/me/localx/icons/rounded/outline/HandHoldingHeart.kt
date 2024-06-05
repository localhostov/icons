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

public val Icons.Outline.HandHoldingHeart: ImageVector
    get() {
        if (_handHoldingHeart != null) {
            return _handHoldingHeart!!
        }
        _handHoldingHeart = Builder(name = "HandHoldingHeart", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.965f, 24.0f)
                lineTo(4.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(0.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(8.857f)
                arcToRelative(3.144f, 3.144f, 0.0f, false, true, 2.69f, 1.519f)
                lineToRelative(3.217f, -3.535f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, 4.254f, -0.2f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, 0.217f, 4.23f)
                lineToRelative(-6.8f, 7.637f)
                arcTo(10.012f, 10.012f, 0.0f, false, true, 8.965f, 24.0f)
                close()
                moveTo(4.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(8.965f, 22.0f)
                arcToRelative(8.005f, 8.005f, 0.0f, false, false, 5.972f, -2.678f)
                lineToRelative(6.805f, -7.638f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, false, -0.072f, -1.421f)
                arcTo(1.029f, 1.029f, 0.0f, false, false, 20.942f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.7f, 0.329f)
                lineTo(15.816f, 15.2f)
                arcTo(3.158f, 3.158f, 0.0f, false, true, 13.3f, 17.252f)
                lineToRelative(-5.161f, 0.738f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.284f, -1.98f)
                lineToRelative(5.162f, -0.737f)
                arcTo(1.142f, 1.142f, 0.0f, false, false, 12.857f, 13.0f)
                close()
                moveTo(11.0f, 9.074f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, true, -1.247f, -0.436f)
                curveTo(8.041f, 7.264f, 6.0f, 5.2f, 6.0f, 3.2f)
                arcTo(3.109f, 3.109f, 0.0f, false, true, 9.0f, 0.0f)
                arcToRelative(2.884f, 2.884f, 0.0f, false, true, 2.0f, 0.817f)
                arcTo(2.884f, 2.884f, 0.0f, false, true, 13.0f, 0.0f)
                arcToRelative(3.109f, 3.109f, 0.0f, false, true, 3.0f, 3.2f)
                curveToRelative(0.0f, 2.0f, -2.041f, 4.064f, -3.754f, 5.439f)
                arcTo(1.986f, 1.986f, 0.0f, false, true, 11.0f, 9.074f)
                close()
                moveTo(9.0f, 2.0f)
                arcTo(1.115f, 1.115f, 0.0f, false, false, 8.0f, 3.2f)
                curveToRelative(0.0f, 0.9f, 1.151f, 2.39f, 3.006f, 3.879f)
                curveTo(12.849f, 5.59f, 14.0f, 4.1f, 14.0f, 3.2f)
                arcTo(1.115f, 1.115f, 0.0f, false, false, 13.0f, 2.0f)
                arcToRelative(1.115f, 1.115f, 0.0f, false, false, -1.0f, 1.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.115f, 1.115f, 0.0f, false, false, 9.0f, 2.0f)
                close()
            }
        }
        .build()
        return _handHoldingHeart!!
    }

private var _handHoldingHeart: ImageVector? = null
