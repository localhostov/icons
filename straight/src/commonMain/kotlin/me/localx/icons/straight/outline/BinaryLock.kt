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

public val Icons.Outline.BinaryLock: ImageVector
    get() {
        if (_binaryLock != null) {
            return _binaryLock!!
        }
        _binaryLock = Builder(name = "BinaryLock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.07f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(3.56f, 13.0f)
                lineTo(0.05f, 16.6f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(1.58f, -1.63f)
                verticalLineToRelative(7.63f)
                horizontalLineToRelative(2.0f)
                lineTo(5.06f, 13.0f)
                horizontalLineToRelative(-1.51f)
                close()
                moveTo(8.07f, 7.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveTo(0.07f, 9.21f, 0.07f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveTo(0.07f, 1.79f, 1.86f, 0.0f, 4.07f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.07f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.07f, 14.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.07f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.07f, 16.0f)
                lineTo(14.07f, 16.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(10.07f, 13.56f)
                curveToRelative(-1.19f, 0.69f, -2.0f, 1.97f, -2.0f, 3.44f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.81f, 1.22f, 3.33f, 2.88f, 3.82f)
                curveToRelative(-0.55f, -0.8f, -0.88f, -1.77f, -0.88f, -2.82f)
                verticalLineToRelative(-7.44f)
                close()
                moveTo(13.56f, 0.0f)
                lineToRelative(-3.51f, 3.6f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(1.58f, -1.63f)
                verticalLineToRelative(6.36f)
                curveToRelative(0.51f, -0.78f, 1.19f, -1.45f, 2.0f, -1.92f)
                lineTo(15.06f, 0.0f)
                horizontalLineToRelative(-1.51f)
                close()
            }
        }
        .build()
        return _binaryLock!!
    }

private var _binaryLock: ImageVector? = null
