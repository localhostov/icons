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

public val Icons.Outline.HelicopterSide: ImageVector
    get() {
        if (_helicopterSide != null) {
            return _helicopterSide!!
        }
        _helicopterSide = Builder(name = "HelicopterSide", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 85.746f)
                verticalLineTo(43.182f)
                horizontalLineTo(341.746f)
                verticalLineTo(21.9f)
                horizontalLineToRelative(-42.564f)
                verticalLineToRelative(21.282f)
                horizontalLineTo(128.928f)
                verticalLineToRelative(42.564f)
                horizontalLineToRelative(170.254f)
                verticalLineToRelative(42.564f)
                horizontalLineTo(43.801f)
                verticalLineTo(85.746f)
                horizontalLineTo(1.237f)
                verticalLineToRelative(146.142f)
                lineTo(150.21f, 253.17f)
                verticalLineToRelative(24.112f)
                curveToRelative(0.062f, 54.06f, 34.159f, 102.222f, 85.127f, 120.242f)
                verticalLineToRelative(50.012f)
                horizontalLineTo(150.21f)
                verticalLineTo(490.1f)
                horizontalLineToRelative(297.945f)
                curveToRelative(35.261f, 0.0f, 63.845f, -28.585f, 63.845f, -63.845f)
                horizontalLineToRelative(-42.564f)
                curveToRelative(0.0f, 11.754f, -9.528f, 21.282f, -21.282f, 21.282f)
                horizontalLineToRelative(-42.564f)
                verticalLineToRelative(-42.564f)
                horizontalLineToRelative(21.282f)
                curveToRelative(47.014f, 0.0f, 85.127f, -38.113f, 85.127f, -85.127f)
                verticalLineToRelative(-21.282f)
                curveToRelative(-0.106f, -93.985f, -76.269f, -170.149f, -170.254f, -170.254f)
                verticalLineTo(85.746f)
                horizontalLineTo(512.0f)
                close()
                moveTo(363.028f, 447.536f)
                horizontalLineTo(277.9f)
                verticalLineToRelative(-42.564f)
                horizontalLineToRelative(85.127f)
                verticalLineTo(447.536f)
                close()
                moveTo(426.873f, 362.409f)
                horizontalLineTo(277.9f)
                curveToRelative(-47.014f, 0.0f, -85.127f, -38.113f, -85.127f, -85.127f)
                verticalLineToRelative(-61.015f)
                lineTo(43.801f, 194.985f)
                verticalLineToRelative(-24.112f)
                horizontalLineToRelative(255.381f)
                verticalLineToRelative(148.972f)
                horizontalLineToRelative(170.254f)
                curveTo(469.436f, 343.353f, 450.38f, 362.409f, 426.873f, 362.409f)
                close()
                moveTo(467.5f, 277.282f)
                horizontalLineTo(341.746f)
                verticalLineTo(170.873f)
                curveTo(403.998f, 170.946f, 457.124f, 215.9f, 467.5f, 277.282f)
                lineTo(467.5f, 277.282f)
                close()
            }
        }
        .build()
        return _helicopterSide!!
    }

private var _helicopterSide: ImageVector? = null
