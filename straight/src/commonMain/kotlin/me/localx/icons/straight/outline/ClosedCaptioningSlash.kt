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

public val Icons.Outline.ClosedCaptioningSlash: ImageVector
    get() {
        if (_closedCaptioningSlash != null) {
            return _closedCaptioningSlash!!
        }
        _closedCaptioningSlash = Builder(name = "ClosedCaptioningSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.01f, 22.59f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-7.24f, -7.24f)
                curveToRelative(-1.4f, -0.55f, -2.35f, -1.98f, -2.35f, -3.76f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.28f, 1.56f, -4.0f, 3.62f, -4.0f)
                horizontalLineToRelative(0.29f)
                curveToRelative(1.4f, 0.0f, 2.69f, 0.96f, 3.28f, 2.45f)
                lineToRelative(-1.86f, 0.74f)
                curveToRelative(-0.29f, -0.72f, -0.85f, -1.19f, -1.42f, -1.19f)
                horizontalLineToRelative(-0.29f)
                curveToRelative(-0.96f, 0.0f, -1.62f, 0.82f, -1.62f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.18f, 0.67f, 2.0f, 1.62f, 2.0f)
                horizontalLineToRelative(0.29f)
                curveToRelative(0.57f, 0.0f, 1.11f, -0.44f, 1.41f, -1.16f)
                lineToRelative(1.85f, 0.77f)
                curveToRelative(-0.42f, 1.02f, -1.15f, 1.77f, -2.01f, 2.13f)
                lineToRelative(2.25f, 2.25f)
                horizontalLineToRelative(1.59f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(6.41f)
                lineToRelative(2.05f, 2.05f)
                curveToRelative(1.18f, 0.21f, 2.22f, 1.11f, 2.73f, 2.4f)
                lineToRelative(-1.86f, 0.74f)
                curveToRelative(-0.29f, -0.72f, -0.85f, -1.19f, -1.42f, -1.19f)
                horizontalLineToRelative(-0.29f)
                curveToRelative(-0.96f, 0.0f, -1.62f, 0.82f, -1.62f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.18f, 0.67f, 2.0f, 1.62f, 2.0f)
                horizontalLineToRelative(0.29f)
                curveToRelative(0.57f, 0.0f, 1.11f, -0.44f, 1.41f, -1.16f)
                lineToRelative(1.85f, 0.77f)
                curveToRelative(-0.61f, 1.47f, -1.86f, 2.39f, -3.26f, 2.39f)
                horizontalLineToRelative(-0.29f)
                curveToRelative(-2.07f, 0.0f, -3.62f, -1.72f, -3.62f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.62f, 0.79f, -2.96f, 1.99f, -3.6f)
                lineTo(0.0f, 1.41f)
                lineTo(1.41f, 0.0f)
                lineToRelative(3.01f, 3.01f)
                horizontalLineTo(21.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(1.59f, 1.59f)
                close()
                moveTo(2.0f, 19.0f)
                verticalLineTo(6.24f)
                lineTo(0.36f, 4.6f)
                curveToRelative(-0.22f, 0.42f, -0.36f, 0.89f, -0.36f, 1.4f)
                verticalLineToRelative(15.0f)
                horizontalLineTo(16.76f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _closedCaptioningSlash!!
    }

private var _closedCaptioningSlash: ImageVector? = null
