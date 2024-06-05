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

public val Icons.Filled.CakeBirthday: ImageVector
    get() {
        if (_cakeBirthday != null) {
            return _cakeBirthday!!
        }
        _cakeBirthday = Builder(name = "CakeBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 13.0f)
                lineTo(2.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 6.816f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 4.0f)
                curveTo(9.0f, 2.534f, 10.813f, 0.946f, 11.369f, 0.494f)
                lineTo(12.0f, -0.019f)
                lineToRelative(0.631f, 0.513f)
                curveTo(13.187f, 0.946f, 15.0f, 2.534f, 15.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, 2.816f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.343f, -0.682f, 1.0f, -1.75f, 1.0f)
                curveToRelative(-1.089f, 0.0f, -1.75f, -0.694f, -1.75f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.343f, -0.682f, 1.0f, -1.75f, 1.0f)
                curveTo(13.661f, 14.0f, 13.0f, 13.306f, 13.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                curveToRelative(0.0f, 0.343f, -0.682f, 1.0f, -1.75f, 1.0f)
                curveToRelative(-1.089f, 0.0f, -1.75f, -0.694f, -1.75f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.343f, -0.682f, 1.0f, -1.75f, 1.0f)
                curveTo(2.661f, 14.0f, 2.0f, 13.306f, 2.0f, 13.0f)
                close()
                moveTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 22.0f)
                close()
                moveTo(22.0f, 15.625f)
                arcTo(4.359f, 4.359f, 0.0f, false, true, 20.25f, 16.0f)
                arcToRelative(4.194f, 4.194f, 0.0f, false, true, -2.75f, -1.0f)
                arcToRelative(4.309f, 4.309f, 0.0f, false, true, -5.5f, 0.015f)
                arcTo(4.309f, 4.309f, 0.0f, false, true, 6.5f, 15.0f)
                arcToRelative(4.194f, 4.194f, 0.0f, false, true, -2.75f, 1.0f)
                arcTo(4.359f, 4.359f, 0.0f, false, true, 2.0f, 15.625f)
                lineTo(2.0f, 20.0f)
                lineTo(22.0f, 20.0f)
                close()
            }
        }
        .build()
        return _cakeBirthday!!
    }

private var _cakeBirthday: ImageVector? = null
