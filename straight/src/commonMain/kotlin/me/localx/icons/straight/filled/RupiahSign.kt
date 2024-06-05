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

public val Icons.Filled.RupiahSign: ImageVector
    get() {
        if (_rupiahSign != null) {
            return _rupiahSign!!
        }
        _rupiahSign = Builder(name = "RupiahSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.5f)
                curveTo(15.0f, 3.36f, 11.64f, 0.0f, 7.5f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 15.0f)
                lineTo(7.5f, 15.0f)
                curveToRelative(0.13f, 0.0f, 0.25f, -0.01f, 0.37f, -0.02f)
                lineToRelative(4.86f, 9.02f)
                horizontalLineToRelative(2.27f)
                lineToRelative(-5.07f, -9.41f)
                curveToRelative(2.94f, -1.01f, 5.07f, -3.8f, 5.07f, -7.09f)
                close()
                moveTo(7.5f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(7.5f, 2.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(20.5f, 13.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 18.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _rupiahSign!!
    }

private var _rupiahSign: ImageVector? = null
