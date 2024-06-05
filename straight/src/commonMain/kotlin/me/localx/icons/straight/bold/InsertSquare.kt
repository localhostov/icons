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

public val Icons.Bold.InsertSquare: ImageVector
    get() {
        if (_insertSquare != null) {
            return _insertSquare!!
        }
        _insertSquare = Builder(name = "InsertSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.768f, 6.732f)
                lineToRelative(4.783f, 4.697f)
                lineToRelative(-2.102f, 2.141f)
                lineToRelative(-2.949f, -2.896f)
                verticalLineToRelative(13.326f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-13.326f)
                lineToRelative(-2.949f, 2.896f)
                lineToRelative(-2.102f, -2.141f)
                lineToRelative(4.793f, -4.707f)
                curveToRelative(0.965f, -0.965f, 2.551f, -0.965f, 3.525f, 0.01f)
                close()
                moveTo(20.5f, 0.0f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _insertSquare!!
    }

private var _insertSquare: ImageVector? = null
