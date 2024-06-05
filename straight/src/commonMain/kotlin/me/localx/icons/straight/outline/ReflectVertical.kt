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

public val Icons.Outline.ReflectVertical: ImageVector
    get() {
        if (_reflectVertical != null) {
            return _reflectVertical!!
        }
        _reflectVertical = Builder(name = "ReflectVertical", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveToRelative(0.65f, 0.0f, 1.27f, -0.28f, 1.7f, -0.76f)
                lineTo(21.25f, 0.0f)
                lineTo(2.75f, 0.0f)
                lineToRelative(7.54f, 8.24f)
                curveToRelative(0.44f, 0.49f, 1.06f, 0.76f, 1.71f, 0.76f)
                close()
                moveTo(16.71f, 2.0f)
                lineToRelative(-4.49f, 4.9f)
                curveToRelative(-0.15f, 0.17f, -0.28f, 0.18f, -0.45f, 0.0f)
                lineTo(7.29f, 2.0f)
                horizontalLineToRelative(9.41f)
                close()
                moveTo(10.3f, 15.75f)
                lineTo(2.75f, 24.0f)
                lineTo(21.25f, 24.0f)
                lineToRelative(-7.54f, -8.24f)
                curveToRelative(-0.87f, -0.97f, -2.56f, -0.96f, -3.41f, 0.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 11.0f)
                close()
            }
        }
        .build()
        return _reflectVertical!!
    }

private var _reflectVertical: ImageVector? = null
