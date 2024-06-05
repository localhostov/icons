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

public val Icons.Bold.PointerText: ImageVector
    get() {
        if (_pointerText != null) {
            return _pointerText!!
        }
        _pointerText = Builder(name = "PointerText", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 4.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.157f, 0.0f, -2.202f, -0.451f, -3.0f, -1.17f)
                curveToRelative(-0.798f, 0.72f, -1.843f, 1.17f, -3.0f, 1.17f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineTo(4.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.157f, 0.0f, 2.202f, 0.451f, 3.0f, 1.17f)
                curveToRelative(0.798f, -0.72f, 1.843f, -1.17f, 3.0f, -1.17f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pointerText!!
    }

private var _pointerText: ImageVector? = null
