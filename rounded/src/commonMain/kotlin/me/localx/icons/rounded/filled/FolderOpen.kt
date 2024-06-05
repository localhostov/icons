package me.localx.icons.rounded.filled

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

public val Icons.Filled.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 18.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.794f, 1.794f, 1.0f, 4.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.464f, 0.0f, 0.928f, 0.109f, 1.342f, 0.316f)
                lineToRelative(3.155f, 1.578f)
                curveToRelative(0.138f, 0.069f, 0.293f, 0.105f, 0.447f, 0.105f)
                horizontalLineToRelative(5.056f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                horizontalLineToRelative(-10.976f)
                curveToRelative(-2.638f, 0.0f, -5.003f, 1.766f, -5.754f, 4.303f)
                lineToRelative(-2.673f, 9.339f)
                curveToRelative(-0.977f, -0.913f, -1.597f, -2.203f, -1.597f, -3.642f)
                close()
                moveTo(23.493f, 11.017f)
                curveToRelative(-0.479f, -0.643f, -1.209f, -1.012f, -2.008f, -1.025f)
                curveToRelative(-0.015f, 0.0f, -0.027f, 0.008f, -0.042f, 0.008f)
                horizontalLineToRelative(-11.419f)
                curveToRelative(-1.758f, 0.0f, -3.335f, 1.177f, -3.834f, 2.862f)
                lineToRelative(-2.818f, 9.843f)
                curveToRelative(0.513f, 0.178f, 1.055f, 0.295f, 1.628f, 0.295f)
                horizontalLineToRelative(12.558f)
                curveToRelative(2.226f, 0.0f, 4.15f, -1.432f, 4.802f, -3.607f)
                lineToRelative(1.532f, -6.116f)
                curveToRelative(0.234f, -0.782f, 0.089f, -1.605f, -0.398f, -2.26f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
