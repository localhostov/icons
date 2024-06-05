package me.localx.icons.rounded.outline

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

public val Icons.Outline.MoveToFolder2: ImageVector
    get() {
        if (_moveToFolder2 != null) {
            return _moveToFolder2!!
        }
        _moveToFolder2 = Builder(name = "MoveToFolder2", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.15f, 0.0f, -0.31f, -0.04f, -0.45f, -0.11f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.41f, -0.21f, -0.88f, -0.32f, -1.34f, -0.32f)
                horizontalLineToRelative(-2.53f)
                curveTo(2.24f, 1.0f, 0.0f, 3.24f, 0.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 6.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.15f, 0.0f, 0.31f, 0.04f, 0.45f, 0.11f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.41f, 0.21f, 0.88f, 0.32f, 1.34f, 0.32f)
                horizontalLineToRelative(6.53f)
                curveToRelative(1.3f, 0.0f, 2.42f, 0.84f, 2.83f, 2.0f)
                lineTo(2.0f, 7.01f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(24.0f, 19.0f)
                curveToRelative(0.0f, 0.86f, -0.36f, 1.67f, -1.02f, 2.27f)
                lineToRelative(-1.55f, 1.46f)
                curveToRelative(-0.19f, 0.18f, -0.44f, 0.27f, -0.69f, 0.27f)
                curveToRelative(-0.27f, 0.0f, -0.53f, -0.11f, -0.73f, -0.31f)
                curveToRelative(-0.38f, -0.4f, -0.36f, -1.04f, 0.04f, -1.41f)
                lineToRelative(1.35f, -1.27f)
                horizontalLineToRelative(-7.42f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.42f)
                lineToRelative(-1.35f, -1.27f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.04f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.41f, -0.04f)
                lineToRelative(1.56f, 1.47f)
                curveToRelative(0.65f, 0.59f, 1.01f, 1.4f, 1.01f, 2.26f)
                close()
            }
        }
        .build()
        return _moveToFolder2!!
    }

private var _moveToFolder2: ImageVector? = null
