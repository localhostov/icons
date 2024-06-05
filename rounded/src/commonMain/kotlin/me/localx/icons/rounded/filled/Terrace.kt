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

public val Icons.Filled.Terrace: ImageVector
    get() {
        if (_terrace != null) {
            return _terrace!!
        }
        _terrace = Builder(name = "Terrace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(0.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 22.0f)
                close()
                moveTo(23.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(20.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(19.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(24.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 15.0f)
                close()
                moveTo(21.894f, 5.985f)
                lineTo(14.869f, 0.979f)
                arcToRelative(4.979f, 4.979f, 0.0f, false, false, -2.823f, -0.97f)
                arcToRelative(0.981f, 0.981f, 0.0f, false, true, 0.74f, 0.4f)
                curveToRelative(0.009f, 0.005f, 5.32f, 6.479f, 5.32f, 6.479f)
                arcTo(5.024f, 5.024f, 0.0f, false, true, 19.0f, 9.734f)
                lineTo(19.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(17.0f, 9.734f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, false, -0.5f, -1.659f)
                lineTo(13.0f, 3.8f)
                lineTo(13.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 3.8f)
                lineTo(7.442f, 8.154f)
                arcTo(2.974f, 2.974f, 0.0f, false, false, 7.0f, 9.734f)
                lineTo(7.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(5.0f, 9.734f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, true, 0.835f, -2.766f)
                reflectiveCurveTo(11.2f, 0.414f, 11.217f, 0.406f)
                arcTo(0.981f, 0.981f, 0.0f, false, true, 12.0f, 0.0f)
                arcTo(5.083f, 5.083f, 0.0f, false, false, 9.079f, 0.963f)
                lineTo(2.106f, 5.985f)
                arcTo(5.13f, 5.13f, 0.0f, false, false, 0.0f, 10.122f)
                arcTo(2.881f, 2.881f, 0.0f, false, false, 2.878f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 13.0f)
                horizontalLineToRelative(8.122f)
                arcTo(2.881f, 2.881f, 0.0f, false, false, 24.0f, 10.122f)
                arcTo(5.13f, 5.13f, 0.0f, false, false, 21.894f, 5.985f)
                close()
            }
        }
        .build()
        return _terrace!!
    }

private var _terrace: ImageVector? = null
