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

public val Icons.Filled.GlassCheers: ImageVector
    get() {
        if (_glassCheers != null) {
            return _glassCheers!!
        }
        _glassCheers = Builder(name = "GlassCheers", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.732f, 22.237f)
                lineToRelative(-5.779f, 1.8f)
                lineToRelative(-0.594f, -1.91f)
                lineToRelative(1.93f, -0.6f)
                lineToRelative(-0.8f, -2.556f)
                arcToRelative(4.979f, 4.979f, 0.0f, false, true, -5.308f, -3.627f)
                lineToRelative(-0.135f, -0.4f)
                lineTo(14.006f, 12.0f)
                lineTo(22.6f, 12.0f)
                lineToRelative(0.2f, 0.607f)
                arcToRelative(4.967f, 4.967f, 0.0f, false, true, -2.4f, 5.764f)
                lineToRelative(0.8f, 2.558f)
                lineToRelative(1.939f, -0.6f)
                close()
                moveTo(10.572f, 6.184f)
                lineTo(6.719f, 5.11f)
                arcTo(3.008f, 3.008f, 0.0f, false, false, 3.052f, 7.1f)
                lineTo(2.078f, 10.0f)
                lineTo(12.619f, 10.0f)
                lineToRelative(0.02f, -0.059f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.067f, -3.757f)
                close()
                moveTo(1.185f, 12.657f)
                arcToRelative(4.964f, 4.964f, 0.0f, false, false, 2.4f, 5.707f)
                lineToRelative(-0.817f, 2.568f)
                lineToRelative(-1.947f, -0.6f)
                lineTo(0.23f, 22.237f)
                lineToRelative(5.781f, 1.8f)
                lineToRelative(0.593f, -1.91f)
                lineToRelative(-1.923f, -0.6f)
                lineTo(5.5f, 18.966f)
                arcTo(4.93f, 4.93f, 0.0f, false, false, 6.01f, 19.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 10.8f, 15.392f)
                lineTo(11.945f, 12.0f)
                lineTo(1.406f, 12.0f)
                close()
                moveTo(17.707f, 1.707f)
                lineTo(16.293f, 0.293f)
                lineTo(14.005f, 2.582f)
                lineTo(15.419f, 4.0f)
                close()
                moveTo(9.957f, 2.543f)
                lineTo(7.707f, 0.293f)
                lineTo(6.293f, 1.707f)
                lineToRelative(2.25f, 2.25f)
                close()
                moveTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                close()
                moveTo(14.656f, 10.0f)
                horizontalLineToRelative(7.27f)
                lineTo(20.96f, 7.132f)
                arcTo(3.023f, 3.023f, 0.0f, false, false, 17.283f, 5.11f)
                lineToRelative(-3.527f, 0.983f)
                arcToRelative(4.907f, 4.907f, 0.0f, false, true, 0.391f, 0.57f)
                arcTo(4.936f, 4.936f, 0.0f, false, true, 14.656f, 10.0f)
                close()
            }
        }
        .build()
        return _glassCheers!!
    }

private var _glassCheers: ImageVector? = null
