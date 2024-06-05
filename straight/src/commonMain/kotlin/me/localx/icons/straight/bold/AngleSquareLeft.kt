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

public val Icons.Bold.AngleSquareLeft: ImageVector
    get() {
        if (_angleSquareLeft != null) {
            return _angleSquareLeft!!
        }
        _angleSquareLeft = Builder(name = "AngleSquareLeft", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 24.0f, 3.5f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.731f, 13.785f)
                lineToRelative(4.25f, 4.25f)
                lineTo(15.1f, 15.914f)
                lineToRelative(-3.9f, -3.9f)
                lineToRelative(3.9f, -3.9f)
                lineTo(12.981f, 6.0f)
                lineToRelative(-4.25f, 4.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.535f)
                close()
            }
        }
        .build()
        return _angleSquareLeft!!
    }

private var _angleSquareLeft: ImageVector? = null
