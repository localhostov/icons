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

public val Icons.Outline.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.493f, 11.017f)
                curveToRelative(-0.487f, -0.654f, -1.234f, -1.03f, -2.05f, -1.03f)
                horizontalLineToRelative(-0.443f)
                verticalLineToRelative(-1.987f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-5.056f)
                curveToRelative(-0.154f, 0.0f, -0.31f, -0.037f, -0.447f, -0.105f)
                lineToRelative(-3.155f, -1.578f)
                curveToRelative(-0.414f, -0.207f, -0.878f, -0.316f, -1.342f, -0.316f)
                horizontalLineToRelative(-2.0f)
                curveTo(1.794f, 1.0f, 0.0f, 2.794f, 0.0f, 5.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.558f)
                curveToRelative(2.226f, 0.0f, 4.15f, -1.432f, 4.802f, -3.607f)
                lineToRelative(1.532f, -6.116f)
                curveToRelative(0.234f, -0.782f, 0.089f, -1.605f, -0.398f, -2.26f)
                close()
                moveTo(2.0f, 18.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.154f, 0.0f, 0.31f, 0.037f, 0.447f, 0.105f)
                lineToRelative(3.155f, 1.578f)
                curveToRelative(0.414f, 0.207f, 0.878f, 0.316f, 1.342f, 0.316f)
                horizontalLineToRelative(5.056f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.987f)
                horizontalLineToRelative(-10.385f)
                curveToRelative(-1.7f, 0.0f, -3.218f, 1.079f, -3.789f, 2.72f)
                lineToRelative(-2.19f, 7.138f)
                curveToRelative(-0.398f, -0.509f, -0.636f, -1.15f, -0.636f, -1.845f)
                close()
                moveTo(21.964f, 12.747f)
                lineToRelative(-1.532f, 6.115f)
                curveToRelative(-0.384f, 1.279f, -1.539f, 2.138f, -2.874f, 2.138f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-0.208f, 0.0f, -0.411f, -0.021f, -0.607f, -0.062f)
                lineToRelative(2.334f, -7.609f)
                curveToRelative(0.279f, -0.803f, 1.039f, -1.342f, 1.889f, -1.342f)
                horizontalLineToRelative(12.828f)
                curveToRelative(0.242f, 0.0f, 0.383f, 0.14f, 0.445f, 0.224f)
                curveToRelative(0.062f, 0.084f, 0.156f, 0.259f, 0.075f, 0.536f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
