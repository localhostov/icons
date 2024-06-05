package me.localx.icons.straight.filled

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

public val Icons.Filled.TrashUndo: ImageVector
    get() {
        if (_trashUndo != null) {
            return _trashUndo!!
        }
        _trashUndo = Builder(name = "TrashUndo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.643f)
                lineToRelative(1.704f, 15.331f)
                curveToRelative(0.169f, 1.521f, 1.45f, 2.669f, 2.981f, 2.669f)
                horizontalLineToRelative(9.305f)
                curveToRelative(1.53f, 0.0f, 2.812f, -1.147f, 2.982f, -2.669f)
                lineToRelative(1.703f, -15.331f)
                horizontalLineToRelative(1.682f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.008f)
                lineToRelative(2.302f, 2.291f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.299f, -3.298f)
                curveToRelative(-0.774f, -0.775f, -0.774f, -2.037f, 0.0f, -2.812f)
                lineToRelative(3.3f, -3.299f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.291f, 2.291f)
                horizontalLineToRelative(2.997f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _trashUndo!!
    }

private var _trashUndo: ImageVector? = null
