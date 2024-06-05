package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.Interactive: ImageVector
    get() {
        if (_interactive != null) {
            return _interactive!!
        }
        _interactive = Builder(name = "Interactive", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, true, 3.8f, 2.828f)
                lineToRelative(2.177f, 0.791f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.362f, 6.362f)
                lineTo(8.828f, 13.8f)
                arcTo(3.988f, 3.988f, 0.0f, false, true, 10.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                curveToRelative(0.0f, 0.117f, -0.013f, 0.231f, -0.018f, 0.347f)
                lineToRelative(1.96f, 0.713f)
                arcToRelative(10.016f, 10.016f, 0.0f, true, false, -8.882f, 8.882f)
                lineToRelative(-0.713f, -1.96f)
                curveTo(10.231f, 17.987f, 10.117f, 18.0f, 10.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.779f)
                lineToRelative(-10.462f, -3.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.563f, 2.562f)
                lineTo(14.779f, 24.0f)
                lineToRelative(3.9f, -3.9f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(1.414f, -1.414f)
                lineTo(20.1f, 18.683f)
                close()
                moveTo(15.586f, 20.365f)
                lineTo(12.855f, 12.855f)
                lineTo(20.365f, 15.586f)
                close()
            }
        }
        .build()
        return _interactive!!
    }

private var _interactive: ImageVector? = null
