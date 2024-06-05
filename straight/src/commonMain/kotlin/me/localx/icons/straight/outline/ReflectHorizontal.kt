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

public val Icons.Outline.ReflectHorizontal: ImageVector
    get() {
        if (_reflectHorizontal != null) {
            return _reflectHorizontal!!
        }
        _reflectHorizontal = Builder(name = "ReflectHorizontal", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 10.3f)
                lineTo(0.0f, 2.75f)
                lineTo(0.0f, 21.25f)
                lineToRelative(8.24f, -7.54f)
                curveToRelative(0.49f, -0.43f, 0.76f, -1.06f, 0.76f, -1.71f)
                reflectiveCurveToRelative(-0.28f, -1.28f, -0.76f, -1.7f)
                close()
                moveTo(6.9f, 12.23f)
                lineToRelative(-4.89f, 4.48f)
                lineTo(2.01f, 7.29f)
                lineToRelative(4.9f, 4.49f)
                curveToRelative(0.09f, 0.08f, 0.1f, 0.17f, 0.1f, 0.22f)
                reflectiveCurveToRelative(-0.01f, 0.14f, -0.11f, 0.23f)
                close()
                moveTo(15.76f, 10.29f)
                curveToRelative(-0.49f, 0.44f, -0.76f, 1.06f, -0.76f, 1.71f)
                reflectiveCurveToRelative(0.28f, 1.27f, 0.76f, 1.7f)
                lineToRelative(8.24f, 7.54f)
                lineTo(24.0f, 2.75f)
                lineToRelative(-8.24f, 7.54f)
                close()
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 0.0f)
                close()
            }
        }
        .build()
        return _reflectHorizontal!!
    }

private var _reflectHorizontal: ImageVector? = null
