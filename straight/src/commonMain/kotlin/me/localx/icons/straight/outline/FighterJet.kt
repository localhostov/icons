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

public val Icons.Outline.FighterJet: ImageVector
    get() {
        if (_fighterJet != null) {
            return _fighterJet!!
        }
        _fighterJet = Builder(name = "FighterJet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.583f, 8.558f)
                lineTo(11.581f, 2.0f)
                lineTo(13.0f, 2.0f)
                lineTo(13.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 9.0f)
                lineTo(5.537f, 9.0f)
                lineTo(4.44f, 7.343f)
                arcTo(2.993f, 2.993f, 0.0f, false, false, 1.938f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 18.0f)
                lineTo(1.952f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.5f, -1.347f)
                lineTo(5.54f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.0f)
                lineTo(13.0f, 22.0f)
                lineTo(11.584f, 22.0f)
                lineToRelative(4.0f, -6.531f)
                curveTo(26.843f, 14.9f, 26.845f, 9.091f, 15.583f, 8.558f)
                close()
                moveTo(14.937f, 13.508f)
                lineTo(14.418f, 13.542f)
                lineTo(9.239f, 22.0f)
                lineTo(9.0f, 22.0f)
                lineTo(9.0f, 13.0f)
                lineTo(4.46f, 13.0f)
                lineTo(2.786f, 15.552f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 16.0f)
                lineTo(2.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.772f, 0.446f)
                lineTo(4.463f, 11.0f)
                lineTo(9.0f, 11.0f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(0.238f)
                lineToRelative(5.18f, 8.488f)
                lineToRelative(0.522f, 0.032f)
                curveToRelative(3.138f, 0.188f, 6.327f, 0.873f, 6.994f, 1.481f)
                curveTo(21.27f, 12.611f, 18.079f, 13.309f, 14.937f, 13.508f)
                close()
            }
        }
        .build()
        return _fighterJet!!
    }

private var _fighterJet: ImageVector? = null
