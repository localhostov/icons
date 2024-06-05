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

public val Icons.Outline.BahtSign: ImageVector
    get() {
        if (_bahtSign != null) {
            return _bahtSign!!
        }
        _bahtSign = Builder(name = "BahtSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.43f, 11.35f)
                curveToRelative(0.97f, -0.99f, 1.57f, -2.35f, 1.57f, -3.85f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0.0f, -2.36f, -1.49f, -4.37f, -3.57f, -5.15f)
                close()
                moveTo(13.5f, 4.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(6.0f, 5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.0f, 5.0f)
                close()
                moveTo(7.0f, 20.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(15.5f, 20.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _bahtSign!!
    }

private var _bahtSign: ImageVector? = null
