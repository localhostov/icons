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

public val Icons.Bold.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) {
            return _circleDashed!!
        }
        _circleDashed = Builder(name = "CircleDashed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.41f, 19.74f)
                lineToRelative(-1.54f, 2.58f)
                curveToRelative(-1.72f, -1.03f, -3.17f, -2.48f, -4.19f, -4.19f)
                lineToRelative(2.58f, -1.53f)
                curveToRelative(0.77f, 1.29f, 1.86f, 2.38f, 3.15f, 3.15f)
                close()
                moveTo(19.74f, 7.41f)
                lineToRelative(2.58f, -1.53f)
                curveToRelative(-1.02f, -1.72f, -2.47f, -3.17f, -4.19f, -4.19f)
                lineToRelative(-1.54f, 2.58f)
                curveToRelative(1.29f, 0.77f, 2.38f, 1.86f, 3.15f, 3.15f)
                close()
                moveTo(1.68f, 5.87f)
                lineToRelative(2.58f, 1.54f)
                curveToRelative(0.77f, -1.29f, 1.86f, -2.38f, 3.15f, -3.15f)
                lineToRelative(-1.53f, -2.58f)
                curveToRelative(-1.72f, 1.02f, -3.17f, 2.47f, -4.19f, 4.19f)
                close()
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -0.86f, 0.12f, -1.72f, 0.36f, -2.54f)
                lineToRelative(-2.88f, -0.84f)
                curveToRelative(-0.32f, 1.1f, -0.48f, 2.24f, -0.48f, 3.39f)
                reflectiveCurveToRelative(0.16f, 2.29f, 0.48f, 3.39f)
                lineToRelative(2.88f, -0.84f)
                curveToRelative(-0.24f, -0.82f, -0.36f, -1.68f, -0.36f, -2.54f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-0.86f, 0.0f, -1.72f, -0.12f, -2.54f, -0.36f)
                lineToRelative(-0.84f, 2.88f)
                curveToRelative(1.1f, 0.32f, 2.24f, 0.48f, 3.39f, 0.48f)
                reflectiveCurveToRelative(2.29f, -0.16f, 3.39f, -0.48f)
                lineToRelative(-0.84f, -2.88f)
                curveToRelative(-0.82f, 0.24f, -1.68f, 0.36f, -2.54f, 0.36f)
                close()
                moveTo(23.52f, 8.61f)
                lineToRelative(-2.88f, 0.84f)
                curveToRelative(0.24f, 0.82f, 0.36f, 1.68f, 0.36f, 2.54f)
                reflectiveCurveToRelative(-0.12f, 1.72f, -0.36f, 2.54f)
                lineToRelative(2.88f, 0.84f)
                curveToRelative(0.32f, -1.1f, 0.48f, -2.24f, 0.48f, -3.39f)
                reflectiveCurveToRelative(-0.16f, -2.29f, -0.48f, -3.39f)
                close()
                moveTo(16.6f, 19.74f)
                lineToRelative(1.53f, 2.58f)
                curveToRelative(1.72f, -1.02f, 3.17f, -2.47f, 4.19f, -4.19f)
                lineToRelative(-2.58f, -1.54f)
                curveToRelative(-0.77f, 1.29f, -1.86f, 2.38f, -3.15f, 3.15f)
                close()
                moveTo(8.61f, 0.48f)
                lineToRelative(0.84f, 2.88f)
                curveToRelative(0.82f, -0.24f, 1.68f, -0.36f, 2.54f, -0.36f)
                reflectiveCurveToRelative(1.72f, 0.12f, 2.54f, 0.36f)
                lineToRelative(0.84f, -2.88f)
                curveToRelative(-1.1f, -0.32f, -2.24f, -0.48f, -3.39f, -0.48f)
                reflectiveCurveToRelative(-2.29f, 0.16f, -3.39f, 0.48f)
                close()
            }
        }
        .build()
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
