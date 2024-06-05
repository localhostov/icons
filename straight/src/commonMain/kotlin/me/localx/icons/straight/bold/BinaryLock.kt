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

public val Icons.Bold.BinaryLock: ImageVector
    get() {
        if (_binaryLock != null) {
            return _binaryLock!!
        }
        _binaryLock = Builder(name = "BinaryLock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 11.0f)
                curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-2.0f)
                curveTo(9.0f, 2.02f, 6.98f, 0.0f, 4.5f, 0.0f)
                reflectiveCurveTo(0.0f, 2.02f, 0.0f, 4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(3.0f, 4.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.0f, 13.0f)
                verticalLineToRelative(11.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-6.44f)
                lineTo(0.12f, 15.72f)
                lineToRelative(2.66f, -2.72f)
                horizontalLineToRelative(2.22f)
                close()
                moveTo(23.0f, 15.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 13.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 21.0f)
                curveToRelative(0.0f, 1.11f, 0.37f, 2.12f, 0.99f, 2.95f)
                curveToRelative(-0.16f, 0.02f, -0.32f, 0.05f, -0.49f, 0.05f)
                curveToRelative(-2.48f, 0.0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.31f, 1.76f, -4.2f, 4.0f, -4.45f)
                verticalLineToRelative(3.04f)
                curveToRelative(-0.58f, 0.21f, -1.0f, 0.76f, -1.0f, 1.41f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.65f, 0.42f, 1.2f, 1.0f, 1.41f)
                verticalLineToRelative(0.09f)
                close()
                moveTo(12.5f, 11.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(12.0f, 4.56f)
                lineToRelative(-1.88f, -1.83f)
                lineTo(12.78f, 0.0f)
                horizontalLineToRelative(2.22f)
                lineTo(15.0f, 8.03f)
                curveToRelative(-1.11f, 0.71f, -1.99f, 1.74f, -2.5f, 2.97f)
                close()
            }
        }
        .build()
        return _binaryLock!!
    }

private var _binaryLock: ImageVector? = null
