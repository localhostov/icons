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

public val Icons.Filled.BinaryLock: ImageVector
    get() {
        if (_binaryLock != null) {
            return _binaryLock!!
        }
        _binaryLock = Builder(name = "BinaryLock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 1.79f, 6.21f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveTo(0.0f, 1.79f, 0.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(6.0f, 7.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(4.91f, 13.0f)
                lineToRelative(0.09f, 1.0f)
                verticalLineToRelative(10.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-1.58f, 1.63f)
                lineTo(-0.02f, 16.6f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.42f)
                close()
                moveTo(13.0f, 3.37f)
                lineToRelative(-1.58f, 1.63f)
                lineToRelative(-1.43f, -1.4f)
                lineTo(13.49f, 0.0f)
                horizontalLineToRelative(1.42f)
                lineToRelative(0.09f, 1.0f)
                lineTo(15.0f, 7.81f)
                curveToRelative(-0.81f, 0.47f, -1.49f, 1.14f, -2.0f, 1.92f)
                lineTo(13.0f, 3.37f)
                close()
                moveTo(10.0f, 21.0f)
                curveToRelative(0.0f, 1.05f, 0.33f, 2.02f, 0.88f, 2.82f)
                curveToRelative(-1.66f, -0.49f, -2.88f, -2.01f, -2.88f, -3.82f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.47f, 0.81f, -2.75f, 2.0f, -3.44f)
                verticalLineToRelative(7.44f)
                close()
            }
        }
        .build()
        return _binaryLock!!
    }

private var _binaryLock: ImageVector? = null
