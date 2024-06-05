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

public val Icons.Outline.GlassWhiskeyRocks: ImageVector
    get() {
        if (_glassWhiskeyRocks != null) {
            return _glassWhiskeyRocks!!
        }
        _glassWhiskeyRocks = Builder(name = "GlassWhiskeyRocks", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 16.0f)
                horizontalLineToRelative(3.385f)
                lineToRelative(2.388f, 2.389f)
                curveToRelative(0.407f, 0.407f, 0.942f, 0.61f, 1.478f, 0.61f)
                reflectiveCurveToRelative(1.07f, -0.204f, 1.478f, -0.611f)
                lineToRelative(2.66f, -2.661f)
                curveToRelative(0.395f, -0.395f, 0.612f, -0.919f, 0.612f, -1.478f)
                reflectiveCurveToRelative(-0.218f, -1.083f, -0.612f, -1.477f)
                lineToRelative(-2.66f, -2.662f)
                curveToRelative(-0.745f, -0.744f, -1.913f, -0.8f, -2.731f, -0.182f)
                curveToRelative(-0.038f, -1.07f, -0.918f, -1.929f, -1.996f, -1.929f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(14.313f, 11.526f)
                lineToRelative(2.66f, 2.661f)
                verticalLineToRelative(0.126f)
                lineToRelative(-2.66f, 2.661f)
                curveToRelative(-0.035f, 0.035f, -0.092f, 0.035f, -0.127f, 0.0f)
                lineToRelative(-1.672f, -1.672f)
                curveToRelative(0.302f, -0.35f, 0.485f, -0.805f, 0.485f, -1.302f)
                verticalLineToRelative(-1.287f)
                lineToRelative(1.187f, -1.187f)
                curveToRelative(0.036f, -0.035f, 0.093f, -0.033f, 0.127f, 0.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                reflectiveCurveToRelative(-4.0f, 0.0f, -4.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(0.018f, 1.0f)
                lineToRelative(1.799f, 19.279f)
                curveToRelative(0.145f, 1.551f, 1.429f, 2.721f, 2.987f, 2.721f)
                horizontalLineToRelative(14.271f)
                curveToRelative(1.549f, 0.0f, 2.832f, -1.162f, 2.985f, -2.701f)
                lineToRelative(1.931f, -19.299f)
                lineTo(0.018f, 1.0f)
                close()
                moveTo(20.07f, 20.1f)
                curveToRelative(-0.051f, 0.513f, -0.479f, 0.9f, -0.995f, 0.9f)
                lineTo(4.804f, 21.0f)
                curveToRelative(-0.52f, 0.0f, -0.947f, -0.39f, -0.995f, -0.907f)
                lineTo(2.213f, 3.0f)
                horizontalLineToRelative(19.566f)
                lineToRelative(-1.71f, 17.1f)
                close()
            }
        }
        .build()
        return _glassWhiskeyRocks!!
    }

private var _glassWhiskeyRocks: ImageVector? = null
