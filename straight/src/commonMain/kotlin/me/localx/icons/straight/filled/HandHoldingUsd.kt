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

public val Icons.Filled.HandHoldingUsd: ImageVector
    get() {
        if (_handHoldingUsd != null) {
            return _handHoldingUsd!!
        }
        _handHoldingUsd = Builder(name = "HandHoldingUsd", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.34f, 12.35f)
                lineToRelative(-10.67f, 11.65f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.34f, 0.0f, 0.62f, -0.28f, 0.62f, -0.62f)
                curveToRelative(0.0f, -0.31f, -0.22f, -0.57f, -0.52f, -0.62f)
                lineToRelative(-3.29f, -0.55f)
                curveToRelative(-1.27f, -0.21f, -2.19f, -1.3f, -2.19f, -2.59f)
                curveToRelative(0.0f, -1.45f, 1.18f, -2.62f, 2.62f, -2.62f)
                horizontalLineToRelative(0.38f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(1.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-0.34f, 0.0f, -0.62f, 0.28f, -0.62f, 0.62f)
                curveToRelative(0.0f, 0.31f, 0.22f, 0.57f, 0.52f, 0.62f)
                lineToRelative(3.29f, 0.55f)
                curveToRelative(1.27f, 0.21f, 2.19f, 1.3f, 2.19f, 2.59f)
                curveToRelative(0.0f, 1.45f, -1.18f, 2.62f, -2.62f, 2.62f)
                horizontalLineToRelative(-0.38f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.79f)
                curveToRelative(1.22f, 0.0f, 2.21f, 0.99f, 2.21f, 2.21f)
                curveToRelative(0.0f, 1.09f, -0.82f, 2.04f, -1.9f, 2.19f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(0.28f, 1.98f)
                lineToRelative(4.24f, -0.61f)
                curveToRelative(2.06f, -0.29f, 3.62f, -2.09f, 3.62f, -4.17f)
                curveToRelative(0.0f, -0.22f, -0.03f, -0.43f, -0.06f, -0.64f)
                lineToRelative(3.54f, -3.74f)
                curveToRelative(0.46f, -0.5f, 1.1f, -0.8f, 1.79f, -0.83f)
                curveToRelative(0.69f, -0.03f, 1.36f, 0.21f, 1.88f, 0.68f)
                curveToRelative(1.05f, 0.96f, 1.14f, 2.6f, 0.19f, 3.66f)
                close()
            }
        }
        .build()
        return _handHoldingUsd!!
    }

private var _handHoldingUsd: ImageVector? = null
