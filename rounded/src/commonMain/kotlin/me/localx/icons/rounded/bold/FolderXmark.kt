package me.localx.icons.rounded.bold

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

public val Icons.Bold.FolderXmark: ImageVector
    get() {
        if (_folderXmark != null) {
            return _folderXmark!!
        }
        _folderXmark = Builder(name = "FolderXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 3.0f)
                horizontalLineToRelative(-5.53f)
                curveToRelative(-0.08f, 0.0f, -0.15f, -0.02f, -0.22f, -0.05f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.48f, -0.24f, -1.02f, -0.37f, -1.56f, -0.37f)
                horizontalLineToRelative(-2.53f)
                curveTo(2.47f, 1.0f, 0.0f, 3.47f, 0.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(24.0f, 8.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 17.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 20.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(3.0f, 8.0f)
                lineTo(20.95f, 8.0f)
                curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(15.56f, 12.56f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(-1.44f, 1.44f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(-1.44f, -1.44f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(1.44f, -1.44f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                close()
            }
        }
        .build()
        return _folderXmark!!
    }

private var _folderXmark: ImageVector? = null
