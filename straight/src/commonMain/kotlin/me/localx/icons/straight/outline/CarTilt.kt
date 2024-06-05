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

public val Icons.Outline.CarTilt: ImageVector
    get() {
        if (_carTilt != null) {
            return _carTilt!!
        }
        _carTilt = Builder(name = "CarTilt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.265f, 22.0f)
                lineToRelative(3.9f, -2.484f)
                lineToRelative(-1.074f, -1.687f)
                lineToRelative(6.747f, -4.3f)
                lineToRelative(1.074f, 1.687f)
                lineToRelative(4.218f, -2.686f)
                lineToRelative(-1.074f, -1.687f)
                lineToRelative(1.687f, -1.075f)
                lineTo(21.915f, 6.9f)
                arcToRelative(12.065f, 12.065f, 0.0f, false, false, -3.952f, -3.846f)
                lineTo(13.579f, 0.427f)
                arcTo(2.982f, 2.982f, 0.0f, false, false, 10.425f, 0.47f)
                lineTo(2.389f, 5.588f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, -1.373f, 2.84f)
                lineToRelative(0.527f, 5.084f)
                arcToRelative(12.077f, 12.077f, 0.0f, false, false, 1.814f, 5.207f)
                lineToRelative(1.829f, 2.87f)
                lineToRelative(1.687f, -1.074f)
                lineTo(7.818f, 22.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(3.463f, 7.274f)
                lineTo(11.5f, 2.157f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.053f, -0.014f)
                lineTo(16.815f, 4.7f)
                lineToRelative(-13.3f, 8.468f)
                lineTo(3.006f, 8.222f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.463f, 7.274f)
                close()
                moveTo(5.045f, 17.645f)
                arcToRelative(9.994f, 9.994f, 0.0f, false, true, -1.1f, -2.376f)
                lineToRelative(1.4f, -0.889f)
                lineToRelative(0.537f, 0.844f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.687f, -1.075f)
                lineToRelative(-0.537f, -0.844f)
                lineToRelative(8.434f, -5.371f)
                lineTo(16.0f, 8.778f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.683f, 7.7f)
                lineToRelative(-0.537f, -0.844f)
                lineToRelative(1.395f, -0.889f)
                arcToRelative(10.091f, 10.091f, 0.0f, false, true, 1.687f, 2.006f)
                lineToRelative(0.753f, 1.183f)
                lineToRelative(-3.174f, 2.022f)
                lineToRelative(-1.043f, 0.664f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-6.747f, 4.3f)
                horizontalLineToRelative(0.0f)
                lineTo(5.8f, 18.829f)
                close()
            }
        }
        .build()
        return _carTilt!!
    }

private var _carTilt: ImageVector? = null
