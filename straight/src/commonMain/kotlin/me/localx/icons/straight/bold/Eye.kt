package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.8f, 11.478f)
                curveToRelative(-0.13f, -0.349f, -3.3f, -8.538f, -11.8f, -8.538f)
                reflectiveCurveTo(0.326f, 11.129f, 0.2f, 11.478f)
                lineTo(0.0f, 12.0f)
                lineToRelative(0.2f, 0.522f)
                curveToRelative(0.13f, 0.349f, 3.3f, 8.538f, 11.8f, 8.538f)
                reflectiveCurveToRelative(11.674f, -8.189f, 11.8f, -8.538f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(12.0f, 18.085f)
                curveToRelative(-5.418f, 0.0f, -8.041f, -4.514f, -8.79f, -6.085f)
                curveTo(3.961f, 10.425f, 6.585f, 5.915f, 12.0f, 5.915f)
                reflectiveCurveTo(20.038f, 10.424f, 20.79f, 12.0f)
                curveTo(20.038f, 13.576f, 17.415f, 18.085f, 12.0f, 18.085f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
