package me.localx.icons.straight.bold

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

public val Icons.Bold.SadCry: ImageVector
    get() {
        if (_sadCry != null) {
            return _sadCry!!
        }
        _sadCry = Builder(name = "SadCry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                curveToRelative(-0.052f, 3.948f, -3.948f, 3.948f, -4.0f, 0.0f)
                curveTo(10.052f, 12.052f, 13.948f, 12.052f, 14.0f, 16.0f)
                close()
                moveTo(5.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                close()
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 14.0f)
                lineTo(16.0f, 14.0f)
                close()
                moveTo(8.0f, 7.0f)
                curveToRelative(-2.267f, 0.0f, -3.0f, 3.369f, -3.0f, 5.0f)
                curveToRelative(2.759f, -2.607f, 3.254f, -2.59f, 6.0f, 0.0f)
                curveTo(11.0f, 10.369f, 10.267f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-2.267f, 0.0f, -3.0f, 3.369f, -3.0f, 5.0f)
                curveToRelative(2.759f, -2.607f, 3.254f, -2.59f, 6.0f, 0.0f)
                curveTo(19.0f, 10.369f, 18.267f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(1.759f, -0.084f, -3.8f, 12.384f, 3.0f, 19.911f)
                lineTo(3.0f, 12.0f)
                curveTo(3.454f, 0.074f, 20.55f, 0.083f, 21.0f, 12.0f)
                verticalLineToRelative(7.911f)
                arcTo(11.938f, 11.938f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(10.0f, 20.768f)
                verticalLineToRelative(3.051f)
                arcToRelative(11.388f, 11.388f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(14.0f, 20.768f)
                arcTo(8.829f, 8.829f, 0.0f, false, true, 10.0f, 20.768f)
                close()
            }
        }
        .build()
        return _sadCry!!
    }

private var _sadCry: ImageVector? = null
