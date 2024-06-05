package me.localx.icons.straight.bold

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

public val Icons.Bold.Soup: ImageVector
    get() {
        if (_soup != null) {
            return _soup!!
        }
        _soup = Builder(name = "Soup", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.154f, 24.0f)
                lineTo(7.844f, 24.0f)
                lineToRelative(-0.3f, -0.144f)
                arcTo(13.417f, 13.417f, 0.0f, false, true, 0.047f, 13.963f)
                arcTo(3.375f, 3.375f, 0.0f, false, true, 0.8f, 11.215f)
                arcTo(3.418f, 3.418f, 0.0f, false, true, 3.417f, 10.0f)
                lineTo(20.581f, 10.0f)
                arcTo(3.42f, 3.42f, 0.0f, false, true, 23.2f, 11.215f)
                arcToRelative(3.374f, 3.374f, 0.0f, false, true, 0.754f, 2.748f)
                arcToRelative(13.415f, 13.415f, 0.0f, false, true, -7.492f, 9.893f)
                close()
                moveTo(8.529f, 21.0f)
                lineTo(15.47f, 21.0f)
                arcToRelative(10.42f, 10.42f, 0.0f, false, false, 5.524f, -7.538f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.089f, -0.311f)
                arcTo(0.421f, 0.421f, 0.0f, false, false, 20.581f, 13.0f)
                lineTo(3.417f, 13.0f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, -0.324f, 0.151f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, false, -0.088f, 0.311f)
                arcTo(10.418f, 10.418f, 0.0f, false, false, 8.529f, 21.0f)
                close()
                moveTo(12.0f, 6.414f)
                arcToRelative(4.885f, 4.885f, 0.0f, false, false, -1.439f, -3.475f)
                arcTo(1.927f, 1.927f, 0.0f, false, true, 10.0f, 1.586f)
                lineTo(10.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 1.586f)
                arcTo(4.885f, 4.885f, 0.0f, false, false, 8.439f, 5.061f)
                arcTo(1.927f, 1.927f, 0.0f, false, true, 9.0f, 6.414f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 5.414f)
                arcToRelative(4.886f, 4.886f, 0.0f, false, false, -1.439f, -3.475f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 15.0f, 0.586f)
                lineTo(15.0f, 0.0f)
                lineTo(12.0f, 0.0f)
                lineTo(12.0f, 0.586f)
                arcToRelative(4.882f, 4.882f, 0.0f, false, false, 1.439f, 3.475f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 14.0f, 5.414f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _soup!!
    }

private var _soup: ImageVector? = null
