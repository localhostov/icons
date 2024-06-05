package me.localx.icons.straight.bold

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

public val Icons.Bold.DiscoBall: ImageVector
    get() {
        if (_discoBall != null) {
            return _discoBall!!
        }
        _discoBall = Builder(name = "DiscoBall", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 14.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 13.5f, 4.125f)
                lineTo(13.5f, 3.0f)
                lineTo(16.0f, 3.0f)
                lineTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(2.5f)
                lineTo(10.5f, 4.125f)
                arcTo(10.006f, 10.006f, 0.0f, false, false, 2.0f, 14.0f)
                close()
                moveTo(9.167f, 20.4f)
                lineTo(9.167f, 16.684f)
                arcToRelative(25.02f, 25.02f, 0.0f, false, true, -3.87f, -0.675f)
                arcToRelative(6.942f, 6.942f, 0.0f, false, true, 0.0f, -4.021f)
                arcToRelative(25.14f, 25.14f, 0.0f, false, true, 3.869f, -0.672f)
                lineTo(9.166f, 7.605f)
                arcToRelative(6.935f, 6.935f, 0.0f, false, true, 5.666f, 0.0f)
                verticalLineToRelative(3.71f)
                arcToRelative(24.968f, 24.968f, 0.0f, false, true, 3.87f, 0.677f)
                arcToRelative(6.942f, 6.942f, 0.0f, false, true, 0.0f, 4.021f)
                arcToRelative(25.331f, 25.331f, 0.0f, false, true, -3.869f, 0.671f)
                lineTo(14.833f, 20.4f)
                arcToRelative(6.935f, 6.935f, 0.0f, false, true, -5.666f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.833f, 16.684f)
                verticalLineTo(11.315f)
                curveToRelative(-0.938f, -0.093f, -1.9f, -0.148f, -2.833f, -0.148f)
                reflectiveCurveToRelative(-1.895f, 0.056f, -2.833f, 0.149f)
                verticalLineToRelative(5.368f)
                curveToRelative(0.938f, 0.094f, 1.9f, 0.149f, 2.833f, 0.149f)
                reflectiveCurveTo(13.9f, 16.778f, 14.833f, 16.684f)
                close()
            }
        }
        .build()
        return _discoBall!!
    }

private var _discoBall: ImageVector? = null
