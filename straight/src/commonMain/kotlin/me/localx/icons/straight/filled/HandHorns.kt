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

public val Icons.Filled.HandHorns: ImageVector
    get() {
        if (_handHorns != null) {
            return _handHorns!!
        }
        _handHorns = Builder(name = "HandHorns", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.7f)
                lineTo(5.0f, 1.5f)
                curveTo(5.0f, 0.59f, 5.81f, -0.13f, 6.75f, 0.02f)
                curveToRelative(0.74f, 0.12f, 1.25f, 0.81f, 1.25f, 1.56f)
                verticalLineToRelative(7.32f)
                curveToRelative(-0.54f, -0.26f, -1.13f, -0.4f, -1.75f, -0.4f)
                curveToRelative(-0.43f, 0.0f, -0.85f, 0.07f, -1.25f, 0.2f)
                close()
                moveTo(17.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(13.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 1.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(19.0f, 13.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-0.74f, 0.0f, -1.43f, -0.23f, -2.0f, -0.63f)
                curveToRelative(-0.57f, 0.4f, -1.26f, 0.63f, -2.0f, 0.63f)
                curveToRelative(-1.12f, 0.0f, -2.11f, -0.52f, -2.75f, -1.34f)
                lineToRelative(-1.85f, 1.85f)
                lineToRelative(-1.45f, -1.38f)
                lineToRelative(2.21f, -2.21f)
                curveToRelative(0.09f, -0.09f, 0.2f, -0.24f, 0.33f, -0.44f)
                curveToRelative(0.42f, -0.76f, 0.31f, -1.74f, -0.33f, -2.39f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineToRelative(-3.25f, 3.24f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(6.84f, 6.84f)
                horizontalLineToRelative(13.57f)
                lineTo(21.99f, 2.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _handHorns!!
    }

private var _handHorns: ImageVector? = null
