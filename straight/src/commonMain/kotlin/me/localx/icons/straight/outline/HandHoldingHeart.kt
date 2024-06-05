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
                moveTo(23.018f, 8.785f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, false, -4.254f, 0.2f)
                lineToRelative(-3.217f, 3.535f)
                arcTo(3.144f, 3.144f, 0.0f, false, false, 12.857f, 11.0f)
                lineTo(3.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(13.448f, 24.0f)
                lineToRelative(9.787f, -10.985f)
                arcTo(3.022f, 3.022f, 0.0f, false, false, 23.018f, 8.785f)
                close()
                moveTo(21.742f, 11.685f)
                lineTo(12.552f, 22.0f)
                lineTo(3.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(9.857f)
                arcToRelative(1.142f, 1.142f, 0.0f, false, true, 0.163f, 2.273f)
                lineToRelative(-5.162f, 0.737f)
                lineToRelative(0.284f, 1.98f)
                lineToRelative(5.161f, -0.738f)
                arcToRelative(3.156f, 3.156f, 0.0f, false, false, 2.513f, -2.058f)
                lineToRelative(4.427f, -4.864f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.7f, -0.329f)
                arcToRelative(1.029f, 1.029f, 0.0f, false, true, 0.728f, 0.262f)
                arcTo(1.015f, 1.015f, 0.0f, false, true, 21.742f, 11.684f)
                close()
                moveTo(10.423f, 9.15f)
                lineTo(11.0f, 9.559f)
                lineToRelative(0.577f, -0.409f)
                curveTo(12.03f, 8.83f, 16.0f, 5.942f, 16.0f, 3.2f)
                arcTo(3.109f, 3.109f, 0.0f, false, false, 13.0f, 0.0f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, false, -2.0f, 0.727f)
                arcTo(3.009f, 3.009f, 0.0f, false, false, 9.0f, 0.0f)
                arcTo(3.109f, 3.109f, 0.0f, false, false, 6.0f, 3.2f)
                curveTo(6.0f, 5.942f, 9.97f, 8.83f, 10.423f, 9.15f)
                close()
                moveTo(9.0f, 2.0f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, 1.0f, -1.0f)
                arcToRelative(1.115f, 1.115f, 0.0f, false, true, 1.0f, 1.2f)
                curveToRelative(0.0f, 1.074f, -1.6f, 2.768f, -3.0f, 3.881f)
                curveToRelative(-1.24f, -1.0f, -3.0f, -2.727f, -3.0f, -3.881f)
                arcTo(1.115f, 1.115f, 0.0f, false, true, 9.0f, 2.0f)
                close()
            }
        }
        .build()
        return _handHoldingHeart!!
    }

private var _handHoldingHeart: ImageVector? = null
