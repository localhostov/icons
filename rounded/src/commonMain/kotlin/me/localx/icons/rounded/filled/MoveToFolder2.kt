package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.MoveToFolder2: ImageVector
    get() {
        if (_moveToFolder2 != null) {
            return _moveToFolder2!!
        }
        _moveToFolder2 = Builder(name = "MoveToFolder2", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.52f, 23.71f)
                lineToRelative(1.61f, -1.61f)
                curveToRelative(0.58f, -0.58f, 0.87f, -1.34f, 0.87f, -2.09f)
                reflectiveCurveToRelative(-0.29f, -1.52f, -0.87f, -2.09f)
                lineToRelative(-1.61f, -1.61f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.29f, 1.29f)
                horizontalLineToRelative(-7.4f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.4f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0.0f)
                close()
                moveTo(14.0f, 23.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                verticalLineToRelative(6.94f)
                lineToRelative(-1.06f, -1.06f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                horizontalLineToRelative(-3.81f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(23.9f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 3.24f, 2.24f, 1.0f, 5.0f, 1.0f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.46f, 0.0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.11f, 0.45f, 0.11f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.41f, 0.0f, 4.43f, 1.72f, 4.9f, 4.0f)
                close()
            }
        }
        .build()
        return _moveToFolder2!!
    }

private var _moveToFolder2: ImageVector? = null
