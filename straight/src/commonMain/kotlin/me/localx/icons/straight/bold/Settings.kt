package me.localx.icons.straight.bold

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

public val Icons.Bold.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.637f)
                arcTo(4.363f, 4.363f, 0.0f, true, false, 16.363f, 12.0f)
                arcTo(4.368f, 4.368f, 0.0f, false, false, 12.0f, 7.637f)
                close()
                moveTo(12.0f, 13.363f)
                arcTo(1.363f, 1.363f, 0.0f, true, true, 13.363f, 12.0f)
                arcTo(1.364f, 1.364f, 0.0f, false, true, 12.0f, 13.363f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                arcToRelative(9.921f, 9.921f, 0.0f, false, false, -0.7f, -3.636f)
                lineTo(23.145f, 7.3f)
                lineToRelative(-1.5f, -2.6f)
                lineTo(19.806f, 5.766f)
                arcTo(9.994f, 9.994f, 0.0f, false, false, 13.5f, 2.125f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(2.125f)
                arcTo(9.991f, 9.991f, 0.0f, false, false, 4.2f, 5.762f)
                lineTo(2.358f, 4.7f)
                lineTo(0.858f, 7.3f)
                lineTo(2.7f, 8.359f)
                arcToRelative(9.865f, 9.865f, 0.0f, false, false, 0.0f, 7.277f)
                lineTo(0.855f, 16.7f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(1.839f, -1.061f)
                arcTo(9.994f, 9.994f, 0.0f, false, false, 10.5f, 21.875f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(21.875f)
                arcToRelative(9.991f, 9.991f, 0.0f, false, false, 6.3f, -3.637f)
                lineToRelative(1.84f, 1.063f)
                lineToRelative(1.5f, -2.6f)
                lineTo(21.3f, 15.641f)
                arcTo(9.948f, 9.948f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 7.0f, -7.0f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
