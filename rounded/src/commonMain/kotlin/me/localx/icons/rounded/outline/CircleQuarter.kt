package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.CircleQuarter: ImageVector
    get() {
        if (_circleQuarter != null) {
            return _circleQuarter!!
        }
        _circleQuarter = Builder(name = "CircleQuarter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                horizontalLineTo(3.04f)
                curveToRelative(-0.93f, 0.0f, -1.8f, -0.42f, -2.38f, -1.15f)
                curveToRelative(-0.58f, -0.73f, -0.8f, -1.68f, -0.59f, -2.6f)
                horizontalLineTo(0.08f)
                curveTo(1.12f, 4.72f, 4.72f, 1.12f, 9.26f, 0.08f)
                curveToRelative(0.92f, -0.21f, 1.86f, 0.0f, 2.6f, 0.59f)
                curveToRelative(0.73f, 0.58f, 1.15f, 1.45f, 1.15f, 2.38f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(2.03f, 9.7f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.07f, 0.32f, 0.0f, 0.65f, 0.2f, 0.9f)
                curveToRelative(0.12f, 0.15f, 0.38f, 0.39f, 0.81f, 0.39f)
                horizontalLineToRelative(7.96f)
                verticalLineTo(3.04f)
                curveToRelative(0.0f, -0.44f, -0.25f, -0.7f, -0.39f, -0.81f)
                curveToRelative(-0.26f, -0.2f, -0.58f, -0.28f, -0.9f, -0.2f)
                curveToRelative(-3.79f, 0.87f, -6.81f, 3.88f, -7.68f, 7.68f)
                close()
            }
        }
        .build()
        return _circleQuarter!!
    }

private var _circleQuarter: ImageVector? = null
