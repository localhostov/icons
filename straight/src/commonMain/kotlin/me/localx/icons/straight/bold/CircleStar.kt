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

public val Icons.Bold.CircleStar: ImageVector
    get() {
        if (_circleStar != null) {
            return _circleStar!!
        }
        _circleStar = Builder(name = "CircleStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.74f, 17.39f)
                lineToRelative(-0.72f, -0.54f)
                lineToRelative(1.3f, -4.08f)
                lineToRelative(-3.32f, -1.85f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(4.35f)
                lineToRelative(1.18f, -4.5f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.18f, 4.5f)
                horizontalLineToRelative(4.33f)
                verticalLineToRelative(0.92f)
                lineToRelative(-3.3f, 1.91f)
                lineToRelative(1.33f, 4.03f)
                lineToRelative(-0.75f, 0.52f)
                lineToRelative(-3.26f, -2.52f)
                lineToRelative(-3.27f, 2.53f)
                close()
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 5.38f, 18.62f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 4.96f, -4.04f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.96f, 3.0f, 12.0f)
                reflectiveCurveTo(7.04f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.04f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _circleStar!!
    }

private var _circleStar: ImageVector? = null
