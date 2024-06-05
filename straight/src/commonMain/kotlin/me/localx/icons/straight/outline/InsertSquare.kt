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

public val Icons.Outline.InsertSquare: ImageVector
    get() {
        if (_insertSquare != null) {
            return _insertSquare!!
        }
        _insertSquare = Builder(name = "InsertSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.414f, 5.586f)
                lineToRelative(4.786f, 4.701f)
                lineToRelative(-1.4f, 1.427f)
                lineToRelative(-3.8f, -3.731f)
                verticalLineToRelative(16.018f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.992f)
                lineToRelative(-3.799f, 3.721f)
                lineToRelative(-1.401f, -1.427f)
                lineToRelative(4.793f, -4.707f)
                curveToRelative(0.772f, -0.774f, 2.042f, -0.774f, 2.822f, 0.006f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _insertSquare!!
    }

private var _insertSquare: ImageVector? = null
