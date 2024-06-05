package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Enter: ImageVector
    get() {
        if (_enter != null) {
            return _enter!!
        }
        _enter = Builder(name = "Enter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.333f, 469.333f)
                horizontalLineToRelative(-42.667f)
                curveToRelative(-35.346f, 0.0f, -64.0f, -28.654f, -64.0f, -64.0f)
                verticalLineTo(106.667f)
                curveToRelative(0.0f, -35.346f, 28.654f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(42.667f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                reflectiveCurveTo(161.115f, 0.0f, 149.333f, 0.0f)
                horizontalLineToRelative(-42.667f)
                curveTo(47.786f, 0.071f, 0.071f, 47.786f, 0.0f, 106.667f)
                verticalLineToRelative(298.667f)
                curveTo(0.071f, 464.214f, 47.786f, 511.93f, 106.667f, 512.0f)
                horizontalLineToRelative(42.667f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(170.667f, 478.885f, 161.115f, 469.333f, 149.333f, 469.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.667f, 234.667f)
                lineTo(490.667f, 234.667f)
                lineToRelative(-336.576f, 0.683f)
                curveToRelative(1.871f, -3.475f, 4.211f, -6.677f, 6.955f, -9.515f)
                lineToRelative(82.752f, -82.752f)
                curveToRelative(8.475f, -8.185f, 8.71f, -21.691f, 0.525f, -30.165f)
                curveToRelative(-8.185f, -8.475f, -21.691f, -8.71f, -30.165f, -0.525f)
                curveToRelative(-0.178f, 0.172f, -0.353f, 0.347f, -0.525f, 0.525f)
                lineToRelative(-82.795f, 82.752f)
                curveToRelative(-33.313f, 33.323f, -33.313f, 87.339f, 0.0f, 120.661f)
                lineToRelative(82.752f, 82.752f)
                curveToRelative(8.185f, 8.475f, 21.691f, 8.709f, 30.165f, 0.524f)
                curveToRelative(8.475f, -8.185f, 8.709f, -21.691f, 0.524f, -30.165f)
                curveToRelative(-0.172f, -0.178f, -0.346f, -0.353f, -0.524f, -0.524f)
                lineToRelative(-82.752f, -82.752f)
                curveToRelative(-2.388f, -2.459f, -4.472f, -5.195f, -6.208f, -8.149f)
                lineToRelative(335.872f, -0.683f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(512.0f, 244.218f, 502.449f, 234.667f, 490.667f, 234.667f)
                close()
            }
        }
        .build()
        return _enter!!
    }

private var _enter: ImageVector? = null
