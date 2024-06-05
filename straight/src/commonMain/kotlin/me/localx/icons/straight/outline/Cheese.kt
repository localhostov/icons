package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 19.0f)
                close()
                moveTo(8.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                lineTo(14.0f, 23.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.833f, 24.0f)
                curveTo(-0.778f, 23.909f, -0.636f, 14.08f, 1.12f, 10.508f)
                arcTo(19.971f, 19.971f, 0.0f, false, true, 8.043f, 0.96f)
                arcTo(4.962f, 4.962f, 0.0f, false, true, 13.751f, 0.849f)
                lineTo(24.0f, 8.5f)
                close()
                moveTo(15.854f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 10.0f)
                lineTo(4.833f, 10.0f)
                arcToRelative(1.985f, 1.985f, 0.0f, false, false, -1.844f, 1.223f)
                arcTo(12.72f, 12.72f, 0.0f, false, false, 2.0f, 16.0f)
                arcToRelative(12.72f, 12.72f, 0.0f, false, false, 0.989f, 4.777f)
                arcTo(1.985f, 1.985f, 0.0f, false, false, 4.833f, 22.0f)
                lineTo(9.146f, 22.0f)
                arcTo(3.513f, 3.513f, 0.0f, false, true, 15.854f, 22.0f)
                close()
                moveTo(10.971f, 2.0f)
                arcToRelative(2.891f, 2.891f, 0.0f, false, false, -1.731f, 0.567f)
                arcToRelative(18.175f, 18.175f, 0.0f, false, false, -4.8f, 5.458f)
                arcToRelative(3.743f, 3.743f, 0.0f, false, true, 0.4f, -0.02f)
                lineTo(19.989f, 8.005f)
                lineTo(12.6f, 2.482f)
                arcTo(2.945f, 2.945f, 0.0f, false, false, 10.971f, 2.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
