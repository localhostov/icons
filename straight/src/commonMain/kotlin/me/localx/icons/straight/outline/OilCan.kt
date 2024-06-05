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

public val Icons.Outline.OilCan: ImageVector
    get() {
        if (_oilCan != null) {
            return _oilCan!!
        }
        _oilCan = Builder(name = "OilCan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.857f, 9.961f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.929f, -0.205f)
                lineTo(15.4f, 9.011f)
                lineToRelative(-0.111f, -0.132f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 13.172f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                lineTo(6.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                lineTo(9.0f, 8.0f)
                lineTo(5.171f, 8.0f)
                lineTo(2.827f, 7.18f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineToRelative(3.146f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, false, 1.658f, 2.684f)
                lineTo(4.0f, 15.7f)
                lineTo(4.0f, 20.0f)
                lineTo(15.463f, 20.0f)
                lineTo(24.0f, 9.945f)
                lineTo(24.0f, 7.62f)
                close()
                moveTo(2.512f, 13.021f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 12.147f)
                lineTo(2.0f, 9.0f)
                lineToRelative(2.0f, 0.707f)
                verticalLineToRelative(3.859f)
                close()
                moveTo(14.537f, 18.0f)
                lineTo(6.0f, 18.0f)
                lineTo(6.0f, 10.0f)
                horizontalLineToRelative(7.172f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.654f, 0.244f)
                lineToRelative(0.524f, 0.745f)
                lineToRelative(0.111f, 0.132f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, false, 2.982f, 0.752f)
                lineToRelative(3.182f, -1.042f)
                close()
                moveTo(23.414f, 16.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.828f, 0.0f)
                lineTo(22.0f, 15.0f)
                close()
            }
        }
        .build()
        return _oilCan!!
    }

private var _oilCan: ImageVector? = null
