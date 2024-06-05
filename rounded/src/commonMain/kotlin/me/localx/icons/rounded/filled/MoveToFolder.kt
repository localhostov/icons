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

public val Icons.Filled.MoveToFolder: ImageVector
    get() {
        if (_moveToFolder != null) {
            return _moveToFolder!!
        }
        _moveToFolder = Builder(name = "MoveToFolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(15.52f, 19.71f)
                lineToRelative(1.61f, -1.61f)
                curveToRelative(0.58f, -0.58f, 0.87f, -1.34f, 0.87f, -2.09f)
                reflectiveCurveToRelative(-0.29f, -1.52f, -0.87f, -2.09f)
                lineToRelative(-1.61f, -1.61f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.29f, 1.29f)
                lineTo(7.0f, 15.01f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                lineTo(15.4f, 17.01f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0.0f)
                close()
            }
        }
        .build()
        return _moveToFolder!!
    }

private var _moveToFolder: ImageVector? = null
