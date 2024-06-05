package me.localx.icons.rounded.bold

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

public val Icons.Bold.HamburgerSoda: ImageVector
    get() {
        if (_hamburgerSoda != null) {
            return _hamburgerSoda!!
        }
        _hamburgerSoda = Builder(name = "HamburgerSoda", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 10.0f)
                lineTo(16.792f, 10.0f)
                lineToRelative(0.142f, -1.077f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 16.3f, 6.275f)
                arcTo(3.377f, 3.377f, 0.0f, false, false, 13.633f, 5.0f)
                lineTo(11.992f, 5.0f)
                lineToRelative(0.236f, -1.574f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.722f, 3.0f)
                lineTo(15.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(12.722f, 0.0f)
                arcTo(3.479f, 3.479f, 0.0f, false, false, 9.261f, 2.98f)
                lineTo(8.958f, 5.0f)
                lineTo(3.367f, 5.0f)
                arcTo(3.378f, 3.378f, 0.0f, false, false, 0.7f, 6.272f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 0.066f, 8.918f)
                lineToRelative(1.4f, 10.664f)
                arcTo(5.184f, 5.184f, 0.0f, false, false, 6.661f, 24.0f)
                lineTo(18.5f, 24.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 18.5f)
                verticalLineToRelative(-3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 18.5f, 10.0f)
                close()
                moveTo(20.949f, 15.0f)
                horizontalLineToRelative(-9.4f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 13.0f)
                horizontalLineToRelative(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.949f, 15.0f)
                close()
                moveTo(13.633f, 8.0f)
                arcToRelative(0.387f, 0.387f, 0.0f, false, true, 0.314f, 0.139f)
                curveToRelative(0.07f, 0.087f, 0.027f, 0.281f, 0.02f, 0.33f)
                lineTo(13.766f, 10.0f)
                lineTo(11.242f, 10.0f)
                lineToRelative(0.3f, -2.0f)
                close()
                moveTo(3.053f, 8.139f)
                arcTo(0.389f, 0.389f, 0.0f, false, true, 3.367f, 8.0f)
                lineTo(8.508f, 8.0f)
                lineToRelative(-0.3f, 2.0f)
                lineTo(3.234f, 10.0f)
                lineToRelative(-0.2f, -1.534f)
                curveTo(3.026f, 8.417f, 2.983f, 8.226f, 3.053f, 8.139f)
                close()
                moveTo(4.444f, 19.191f)
                lineTo(3.629f, 13.0f)
                lineTo(9.107f, 13.0f)
                arcTo(5.463f, 5.463f, 0.0f, false, false, 8.5f, 15.5f)
                verticalLineToRelative(3.0f)
                arcTo(5.463f, 5.463f, 0.0f, false, false, 9.107f, 21.0f)
                lineTo(6.661f, 21.0f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 4.444f, 19.191f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(14.0f, 21.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                lineTo(11.5f, 18.0f)
                horizontalLineToRelative(2.046f)
                lineToRelative(2.622f, 1.748f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.664f, 0.0f)
                lineTo(20.454f, 18.0f)
                lineTo(21.0f, 18.0f)
                verticalLineToRelative(0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 21.0f)
                close()
            }
        }
        .build()
        return _hamburgerSoda!!
    }

private var _hamburgerSoda: ImageVector? = null
