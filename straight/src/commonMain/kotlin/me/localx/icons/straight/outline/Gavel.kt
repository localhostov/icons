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

public val Icons.Outline.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.569f, 10.526f)
                lineToRelative(-0.994f, 0.994f)
                lineTo(12.493f, 2.438f)
                lineToRelative(0.994f, -0.994f)
                lineTo(12.073f, 0.03f)
                lineTo(4.184f, 7.919f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.025f, -1.025f)
                lineToRelative(3.827f, 3.827f)
                lineTo(0.022f, 22.563f)
                lineToRelative(1.414f, 1.414f)
                lineTo(11.864f, 13.55f)
                lineToRelative(3.841f, 3.841f)
                lineToRelative(-1.025f, 1.025f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(7.89f, -7.889f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(17.493f, 10.266f)
                lineToRelative(-3.042f, 3.042f)
                lineToRelative(-3.672f, -3.672f)
                lineToRelative(3.042f, -3.042f)
                lineToRelative(3.673f, 3.672f)
                close()
                moveTo(11.079f, 3.852f)
                lineToRelative(1.327f, 1.327f)
                lineToRelative(-3.042f, 3.042f)
                lineToRelative(-1.327f, -1.327f)
                lineToRelative(3.042f, -3.042f)
                close()
                moveTo(15.865f, 14.722f)
                lineToRelative(3.042f, -3.042f)
                lineToRelative(1.254f, 1.254f)
                lineToRelative(-3.042f, 3.042f)
                lineToRelative(-1.254f, -1.254f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
