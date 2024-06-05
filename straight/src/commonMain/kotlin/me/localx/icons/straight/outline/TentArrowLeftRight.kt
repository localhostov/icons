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

public val Icons.Outline.TentArrowLeftRight: ImageVector
    get() {
        if (_tentArrowLeftRight != null) {
            return _tentArrowLeftRight!!
        }
        _tentArrowLeftRight = Builder(name = "TentArrowLeftRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.998f, 6.787f)
                lineTo(2.365f, 20.188f)
                curveToRelative(-0.475f, 0.777f, -0.491f, 1.716f, -0.046f, 2.509f)
                curveToRelative(0.451f, 0.804f, 1.312f, 1.303f, 2.247f, 1.303f)
                horizontalLineToRelative(14.864f)
                curveToRelative(0.935f, 0.0f, 1.796f, -0.499f, 2.247f, -1.303f)
                curveToRelative(0.445f, -0.793f, 0.429f, -1.731f, -0.088f, -2.572f)
                lineTo(11.998f, 6.787f)
                close()
                moveTo(10.557f, 22.0f)
                lineToRelative(1.443f, -2.186f)
                lineToRelative(1.443f, 2.186f)
                horizontalLineToRelative(-2.887f)
                close()
                moveTo(19.934f, 21.718f)
                curveToRelative(-0.047f, 0.085f, -0.191f, 0.282f, -0.503f, 0.282f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-3.841f, -5.814f)
                lineToRelative(-3.841f, 5.814f)
                horizontalLineToRelative(-3.593f)
                curveToRelative(-0.312f, 0.0f, -0.456f, -0.197f, -0.503f, -0.282f)
                curveToRelative(-0.05f, -0.088f, -0.114f, -0.263f, -0.005f, -0.464f)
                lineToRelative(7.939f, -11.042f)
                lineToRelative(7.927f, 11.017f)
                curveToRelative(0.128f, 0.211f, 0.061f, 0.396f, 0.009f, 0.488f)
                close()
                moveTo(23.42f, 6.406f)
                lineToRelative(-3.3f, 3.299f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.291f, -2.291f)
                lineTo(2.992f, 6.0f)
                lineToRelative(2.302f, 2.291f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.581f, 6.406f)
                curveToRelative(-0.774f, -0.775f, -0.774f, -2.037f, 0.0f, -2.812f)
                lineTo(3.88f, 0.295f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.291f, 2.291f)
                horizontalLineToRelative(18.005f)
                lineToRelative(-2.302f, -2.291f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.299f, 3.298f)
                curveToRelative(0.774f, 0.775f, 0.774f, 2.037f, 0.0f, 2.812f)
                close()
            }
        }
        .build()
        return _tentArrowLeftRight!!
    }

private var _tentArrowLeftRight: ImageVector? = null
