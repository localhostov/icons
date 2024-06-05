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

public val Icons.Outline.Utensils: ImageVector
    get() {
        if (_utensils != null) {
            return _utensils!!
        }
        _utensils = Builder(name = "Utensils", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 9.0f)
                lineTo(2.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                lineTo(4.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(22.0f, 9.267f)
                curveToRelative(0.0f, 4.677f, -3.877f, 9.191f, -5.0f, 10.4f)
                lineTo(17.0f, 24.0f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.609f, 0.812f)
                curveTo(20.155f, 2.887f, 22.0f, 6.039f, 22.0f, 9.267f)
                close()
                moveTo(17.0f, 16.527f)
                curveToRelative(3.9f, -5.028f, 3.92f, -9.477f, 0.0f, -14.52f)
                close()
            }
        }
        .build()
        return _utensils!!
    }

private var _utensils: ImageVector? = null
