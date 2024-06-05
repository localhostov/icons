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

public val Icons.Filled.FolderXmark: ImageVector
    get() {
        if (_folderXmark != null) {
            return _folderXmark!!
        }
        _folderXmark = Builder(name = "FolderXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 3.24f, 2.24f, 1.0f, 5.0f, 1.0f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.46f, 0.0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.11f, 0.45f, 0.11f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.41f, 0.0f, 4.43f, 1.72f, 4.9f, 4.0f)
                lineTo(0.0f, 7.01f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(13.41f, 16.0f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-1.79f, -1.79f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-1.79f, -1.79f)
                close()
            }
        }
        .build()
        return _folderXmark!!
    }

private var _folderXmark: ImageVector? = null
